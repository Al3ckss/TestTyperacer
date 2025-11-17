package typeracerGame.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelImplTest {

    private ModelImpl model;

    @BeforeEach
    void setUp() {
        model = new ModelImpl();
    }

    @Test
    void testInitialState() {
        assertEquals(GameState.READY, model.getState());
        assertEquals(0, model.getPoints());
        assertEquals(GameConfig.INITIAL_TIME_SECONDS, model.getTime());
        assertNull(model.getCurrentWord());
    }

    @Test
    void testSetNewWord() {
        model.setNewWord();
        assertNotNull(model.getCurrentWord());
        assertTrue(WordList.WORDS.contains(model.getCurrentWord()));
    }

    @Test
    void testIncrementPoints() {
        model.incrementPoints();
        assertEquals(1, model.getPoints());
    }

    @Test
    void testDecreaseTime() {
        int initialTime = model.getTime();
        model.decreaseTime();
        assertEquals(initialTime - 1, model.getTime());
    }

    @Test
    void testGameOverState() {
        model.decreaseTime(); // do nothing, state not zero
        model.setState(GameState.RUNNING);
        // decrease time to 0
        for(int i = 0; i < GameConfig.INITIAL_TIME_SECONDS; i++) {
            model.decreaseTime();
        }
        assertEquals(GameState.GAME_OVER, model.getState());
    }

    @Test
    void testGameOverMethod() {
        model.gameOver();
        assertEquals(GameState.GAME_OVER, model.getState());
    }
}
