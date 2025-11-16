package typeracerGame.view;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Interfaccia della Vista per il gioco TypeRacer.
 */
public interface View {

    void setLabel1(String label);

    void setTextField(String text);

    JLabel getLabel1();

    JTextField getTextField();

    void updateTimeLabel(int newTime);
}
