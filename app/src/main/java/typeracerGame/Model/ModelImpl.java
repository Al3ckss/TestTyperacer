package typeracerGame.Model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;

public class ModelImpl {

    private int points = 0;
    private int time = 21;

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

    public void gameOver(JLabel label) {
        label.setText("Tempo Finito. Punti: " + points);
    }

    public String getCurrentWord(JLabel label) {
        return label.getText();
    }

    public int getPoints() {
        return points;
    }

    public void setNewWord(JLabel label) {
        label.setText(getRandom());
    }

    public void incrementPoints() {
        this.points++;
    }

    public String getRandom() {
        return words.get(new Random().nextInt(words.size()));
    }

    public int getTime() {
        return time;
    }

    public void decreaseTime() {
        time--;
    }
}
