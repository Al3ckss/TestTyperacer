package typeracerGame.controller;

import javax.swing.Timer;
import typeracerGame.model.ModelImpl;
import typeracerGame.view.ViewImpl;
import typeracerGame.model.GameConfig;
import typeracerGame.model.GameState;

public class ControllerImpl implements Controller {

    private final ModelImpl model;
    private final ViewImpl view;
    private final Timer timer;

    public ControllerImpl(ModelImpl model, ViewImpl view) {
        this.model = model;
        this.view = view;

        // Imposta parola iniziale e stato
        view.setLabel1(model.getRandom());
        model.setState(GameState.RUNNING);

        timer = new Timer(GameConfig.TIMER_DELAY_MS, e -> {
            if (model.getState() == GameState.RUNNING) {
                if (model.getTime() > 0) {
                    model.decreaseTime();
                    view.updateTimeLabel(model.getTime());
                } else {
                    model.gameOver(view.getLabel1());
                }
            }
        });

        // Azione quando si preme Enter nel campo di testo
        view.getTextField().addActionListener(e -> {
            if (model.getState() != GameState.RUNNING) return;

            String typed = view.getTextField().getText();
            String current = model.getCurrentWord(view.getLabel1());

            if (typed.equals(current)) {
                model.incrementPoints();
                model.setNewWord(view.getLabel1());
                view.setTextField("");
            }
        });

        // Avvia il timer
        timer.start();
    }

    @Override
    public void changeText() {
        view.setTextField(model.getRandom());
    }

    // Useful methods for timer managing
    public void stopTimer() {
        timer.stop();
    }

    public void startTimer() {
        timer.start();
    }
}
