package testtyperacer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View {
    
    
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel("Parola corrente: ");
    JLabel timeLabel = new JLabel("Tempo rimanente: ");
    JTextField textField = new JTextField();

    public void setLabel1(String label) {
        this.label1.setText(label);
    }

    public void setTextField(String text) {
        this.textField.setText(text);
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void updateTimeLabel(int newTime){
        timeLabel.setText("Tempo rimanente: " + newTime);
        timeLabel.revalidate();
        timeLabel.repaint();

    }


    public View(){
        frame.setBounds(0, 0, 700, 500);
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setPreferredSize(new Dimension(700, 100));
        timeLabel.setPreferredSize(new Dimension(700, 100));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setPreferredSize(new Dimension(700, 60));
        frame.add(label1, BorderLayout.NORTH);
        frame.add(timeLabel, BorderLayout.CENTER);
        frame.add(textField, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
