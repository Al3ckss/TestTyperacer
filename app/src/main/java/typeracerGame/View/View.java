package typeracerGame.View;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Interfaccia della Vista per il gioco TypeRacer.
 * <p>
 * Gestisce gli elementi grafici: parola corrente, input utente,
 * tempo rimanente e aggiornamenti dell'interfaccia.
 */
public interface View {

    /**
     * Imposta il testo della label che contiene la parola corrente.
     *
     * @param label il nuovo testo da mostrare
     */
    void setLabel1(String label);

    /**
     * Imposta il testo nel campo di input.
     *
     * @param text il testo da inserire nel campo
     */
    void setTextField(String text);

    /**
     * Restituisce la label che mostra la parola corrente.
     *
     * @return JLabel contenente la parola
     */
    JLabel getLabel1();

    /**
     * Restituisce il campo di input dove l'utente scrive.
     *
     * @return JTextField principale
     */
    JTextField getTextField();

    /**
     * Aggiorna la label del tempo rimanente.
     *
     * @param newTime il nuovo valore del tempo
     */
    void updateTimeLabel(int newTime);
}
