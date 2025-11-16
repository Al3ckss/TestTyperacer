package typeracerGame.Model;

import javax.swing.JLabel;

/**
 * Interfaccia del Modello del gioco TypeRacer.
 * <p>
 * Gestisce la logica del punteggio, della parola corrente,
 * del tempo rimanente e della generazione casuale delle parole.
 */
public interface Model {

    /**
     * Imposta la fine del gioco mostrando il punteggio finale.
     *
     * @param label l'etichetta in cui mostrare il messaggio di game over
     */
    void gameOver(JLabel label);

    /**
     * Restituisce la parola attualmente mostrata nell'interfaccia.
     *
     * @param label la label contenente la parola attuale
     * @return la parola attuale
     */
    String getCurrentWord(JLabel label);

    /**
     * Restituisce il punteggio accumulato.
     *
     * @return il numero di punti
     */
    int getPoints();

    /**
     * Imposta una nuova parola casuale nella label.
     *
     * @param label l'etichetta che deve essere aggiornata
     */
    void setNewWord(JLabel label);

    /**
     * Aumenta il punteggio di 1.
     */
    void incrementPoints();

    /**
     * Restituisce una parola casuale dalla lista.
     *
     * @return una parola casuale
     */
    String getRandom();

    /**
     * Restituisce il tempo rimanente.
     *
     * @return i secondi rimanenti
     */
    int getTime();

    /**
     * Decrementa il tempo rimanente.
     */
    void decreaseTime();
}
