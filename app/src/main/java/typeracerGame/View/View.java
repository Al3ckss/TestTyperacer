package typeracerGame.view;

import javax.swing.JLabel;
import javax.swing.JTextField;

public interface View {
    void setLabel1(String text);
    void updateTimeLabel(int t);

    JLabel getLabel1();
    JTextField getTextField();
}
