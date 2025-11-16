package typeracerGame;

import typeracerGame.Controller.ControllerImpl;
import typeracerGame.Model.ModelImpl;
import typeracerGame.View.ViewImpl;

public class App {
    public static void main(String[] args) {
        ViewImpl view = new ViewImpl();
        ModelImpl model = new ModelImpl();
        view.setLabel1(model.getRandom());
        ControllerImpl controller = new ControllerImpl(model, view);
    }
}
