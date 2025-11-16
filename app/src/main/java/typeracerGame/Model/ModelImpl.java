package typeracerGame.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;

public class ModelImpl implements Model {

    private int points = 0;
    private int time = GameConfig.INITIAL_TIME_SECONDS;
    private GameState state = GameState.READY;

    private final Random random = new Random();

    private final List<String> words = Arrays.asList(
        "auto", "casa", "sole", "luna", "mare", "vento", "pioggia", "neve", "montagna", "fiume",
        "strada", "cielo", "tempo", "notte", "giorno", "amico", "amore", "cuore", "libro", "scuola",
        "computer", "telefono", "tastiera", "schermo", "mouse", "sedia", "tavolo", "porta", "finestra", "letto",
        "sogno", "vita", "gioia", "paura", "forza", "luce", "ombra", "risata", "pianto", "gioco",
        "corsa", "volo", "salto", "cammino", "scrivo", "leggo", "corro", "penso", "creo", "disegno",
        "gatto", "cane", "uccello", "pesce", "tigre", "lupo", "orso", "volpe", "rana", "ape",
        "rosso", "blu", "verde", "giallo", "nero", "bianco", "grigio", "marrone", "chiaro", "scuro",
        "veloce", "lento", "alto", "basso", "forte", "debole", "caldo", "freddo", "facile", "difficile",
        "oggi", "domani", "ieri", "sempre", "mai", "subito", "dopo", "prima", "spesso", "quasi",
        "andare", "venire", "stare", "vedere", "sapere", "volere", "potere", "dire", "parlare", "ascoltare"
    );

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
