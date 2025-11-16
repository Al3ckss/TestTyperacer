package typeracerGame.model;

import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JLabel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelImplTest {

    private ModelImpl model;
    private JLabel label;

    @BeforeEach
    void setUp() {
        model = new ModelImpl();
        label = new JLabel();
    }

    @Test
    void testInitialTimeAndPoints() {
        assertEquals(GameConfig.INITIAL_TIME_SECONDS, model.getTime());
        assertEquals(0, model.getPoints());
    }

    @Test
    void testRandomWordNotNull() {
        String word = model.getRandom();
        assertNotNull(word);
        assertTrue(WordList.WORDS.contains(word));
    }

    @Test
    void testIncrementPoints() {
        int pointsBefore = model.getPoints();
        model.incrementPoints();
        assertEquals(pointsBefore + 1, model.getPoints());
    }

    @Test
    void testSetNewWord() {
        model.setNewWord(label);
        assertNotNull(label.getText());
        assertTrue(WordList.WORDS.contains(label.getText()));
    }

    @Test
    void testGameOverSetsLabel() {
        model.gameOver(label);
        assertEquals("Tempo Finito. Punti: " + model.getPoints(), label.getText());
        assertEquals(GameState.GAME_OVER, model.getState());
    }

    @Test
    void testDecreaseTime() {
        int timeBefore = model.getTime();
        model.decreaseTime();
        assertEquals(timeBefore - 1, model.getTime());
    }

    @Test
    void testGameStateTransitions() {
        assertEquals(GameState.READY, model.getState());
        model.setState(GameState.RUNNING);
        assertEquals(GameState.RUNNING, model.getState());
    }
}
