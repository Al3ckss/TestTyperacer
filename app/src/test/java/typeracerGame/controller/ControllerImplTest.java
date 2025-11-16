package typeracerGame.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import typeracerGame.model.ModelImpl;
import typeracerGame.view.ViewImpl;

class ControllerImplTest {

    private ControllerImpl controller;
    private ModelImpl model;
    private ViewImpl view;

    @BeforeEach
    void setUp() {
        view = new ViewImpl();
        model = new ModelImpl();
        controller = new ControllerImpl(model, view);
    }

    @Test
    void testChangeTextUpdatesTextField() {
        String oldText = view.getTextField().getText();
        controller.changeText();
        assertNotEquals(oldText, view.getTextField().getText());
    }

    @Test
    void testTypingCorrectWordIncrementsPoints() {
        String word = model.getRandom();
        view.setLabel1(word);
        view.getTextField().setText(word);

        // simula Enter
        view.getTextField().postActionEvent();

        assertEquals(1, model.getPoints());
        assertNotEquals(word, view.getLabel1().getText());
    }

    @Test
    void testTimerStopsAtZero() throws InterruptedException {
        model.setState(typeracerGame.model.GameState.RUNNING);
        while (model.getTime() > 0) {
            Thread.sleep(10);
            model.decreaseTime();
        }
        assertEquals(0, model.getTime());
        assertEquals(typeracerGame.model.GameState.GAME_OVER, model.getState());
    }
}
