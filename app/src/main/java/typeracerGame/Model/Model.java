package typeracerGame.model;

import javax.swing.JLabel;

/**
 * Interfaccia del Modello del gioco TypeRacer.
 * Definisce le operazioni principali esposte dal modello.
 */
public interface Model {

    void gameOver(JLabel label);

    String getCurrentWord(JLabel label);

    int getPoints();

    void setNewWord(JLabel label);

    void incrementPoints();

    String getRandom();

    int getTime();

    void decreaseTime();
}
