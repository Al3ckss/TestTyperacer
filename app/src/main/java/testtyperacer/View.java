package testtyperacer;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View {

    JFrame frame = new JFrame();
    JLabel label1 = new JLabel("Parola corrente");
    JTextField textField = new JTextField();

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JTextField getTextField() {
        return textField;
    }

    public View(){
        frame.setBounds(0, 0, 400, 300);
        frame.setLayout(new BorderLayout());
        textField.getPreferredSize();
        frame.add(label1, BorderLayout.NORTH);
        frame.add(textField, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
