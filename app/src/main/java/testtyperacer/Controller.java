package testtyperacer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller {

    Model model;
    View view;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
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
    }

    public void changeText(){
        view.setTextField(model.getRandom());
    }

    //TODO creare timer
}
