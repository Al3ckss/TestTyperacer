package testtyperacer;

public class Controller {

    Model model;
    View view;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void changeText(){
        view.setTextField(model.getRandom());
    }
    
    //TODO creare listener

    //TODO creare timer
}
