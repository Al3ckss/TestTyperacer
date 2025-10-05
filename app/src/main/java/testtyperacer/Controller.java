package testtyperacer;

import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class Controller {

    Model model;
    View view;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;

        Timer timer = new Timer(1000, new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model.getTime() > 0) {
                    model.decreaseTime();
                    view.updateTimeLabel(model.getTime());
                }
                else{
                    model.gameOver(view.label1);
                }
            }
            
        }); 

        view.getTextField().addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {

                if (view.getTextField().getText().equals(model.getCurrentWord(view.getLabel1()))) {
                    model.incrementPoints();
                    model.setNewWord(view.label1);
                    view.setTextField("");
                }
            }   
        } );
    
        if (!timer.isRunning()) {
            timer.start();
        }
        if(model.getTime() == 0){
            timer.stop();
        }
    }
    public void changeText(){
        view.setTextField(model.getRandom());
    }

}
