package typeracerGame.model;

import java.util.List;
import java.util.Random;
import javax.swing.JLabel;

public class ModelImpl implements Model {

    private int points = 0;
    private int time = GameConfig.INITIAL_TIME_SECONDS;
    private GameState state = GameState.READY;


    private final Random random = new Random();
    private final List<String> words = WordList.WORDS;

    @Override
    public void gameOver(JLabel label) {
        state = GameState.GAME_OVER;
        label.setText("Tempo Finito. Punti: " + points);
    }

    @Override
    public String getCurrentWord(JLabel label) {
        return label.getText();
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void setNewWord(JLabel label) {
        label.setText(getRandom());
    }

    @Override
    public void incrementPoints() {
        this.points++;
    }

    @Override
    public String getRandom() {
        return words.get(random.nextInt(words.size()));
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void decreaseTime() {
        if (time > 0) {
            time--;
            if (time == 0) {
                state = GameState.GAME_OVER;
            }
        }
    }

    // Useful methods for State changes
    public GameState getState() {
        return state;
    }

    public void setState(GameState newState) {
        this.state = newState;
    }
}
