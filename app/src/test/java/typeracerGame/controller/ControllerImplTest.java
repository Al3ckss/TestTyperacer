package typeracerGame.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import typeracerGame.model.ModelImpl;
import typeracerGame.view.ViewImpl;

import static org.junit.jupiter.api.Assertions.*;

class ControllerImplTest {

    private ModelImpl model;
    private ViewImpl view;

    @BeforeEach
    void setUp() {
        model = new ModelImpl();
        view = new ViewImpl();
        model.setNewWord();
        new ControllerImpl(model, view);
    }

    @Test
    void testControllerStartsGame() {
        assertEquals(0, model.getPoints());
        assertEquals(model.getState(), typeracerGame.model.GameState.RUNNING);
    }

    @Test
    void testGameOverAfterTimeExpires() throws InterruptedException {
        model.setState(typeracerGame.model.GameState.RUNNING);
        while (model.getTime() > 0) {
            model.decreaseTime();
        }
        assertEquals(typeracerGame.model.GameState.GAME_OVER, model.getState());
    }
}