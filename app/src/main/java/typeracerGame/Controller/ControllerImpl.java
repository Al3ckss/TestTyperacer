package typeracerGame.Controller;

import javax.swing.Timer;
import typeracerGame.Model.ModelImpl;
import typeracerGame.View.ViewImpl;

public class ControllerImpl {

    private final ModelImpl model;
    private final ViewImpl view;

    public ControllerImpl(ModelImpl model, ViewImpl view) {
        this.model = model;
        this.view = view;

        Timer timer = new Timer(1000, e -> {
            if (model.getTime() > 0) {
                model.decreaseTime();
                view.updateTimeLabel(model.getTime());
            } else {
                model.gameOver(view.label1);
            }
        });

        view.getTextField().addActionListener(e -> {
            if (view.getTextField().getText()
                    .equals(model.getCurrentWord(view.getLabel1()))) {

                model.incrementPoints();
                model.setNewWord(view.label1);
                view.setTextField("");
            }
        });

        if (!timer.isRunning()) {
            timer.start();
        }

        if (model.getTime() == 0) {
            timer.stop();
        }
    }

    public void changeText() {
        view.setTextField(model.getRandom());
    }
}
