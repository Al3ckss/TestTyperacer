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
    //TODO decidere come strutturare il tutto, se lettera per lettera o solo con le parole
    
    //TODO creare listener
}
