package typeracerGame.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import typeracerGame.model.GameConfig;

public class ViewImpl implements View {

    private final JFrame frame = new JFrame();
    private final JLabel label1 = new JLabel("Parola corrente: ");
    private final JLabel timeLabel = new JLabel("Tempo rimanente: ");
    private final JTextField textField = new JTextField();

    public ViewImpl() {
        frame.setBounds(0, 0, GameConfig.FRAME_WIDTH, GameConfig.FRAME_HEIGHT);

        label1.setFont(new Font("Arial", Font.BOLD, GameConfig.LABEL_FONT_SIZE));
        timeLabel.setFont(new Font("Arial", Font.BOLD, GameConfig.LABEL_FONT_SIZE));
        label1.setPreferredSize(new Dimension(GameConfig.FRAME_WIDTH, 100));
        timeLabel.setPreferredSize(new Dimension(GameConfig.FRAME_WIDTH, 100));
        textField.setFont(new Font("Arial", Font.PLAIN, GameConfig.INPUT_FONT_SIZE));
        textField.setPreferredSize(new Dimension(GameConfig.FRAME_WIDTH, 60));

        frame.add(label1, BorderLayout.NORTH);
        frame.add(timeLabel, BorderLayout.CENTER);
        frame.add(textField, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void setLabel1(String label) {
        this.label1.setText(label);
    }

    @Override
    public void setTextField(String text) {
        this.textField.setText(text);
    }

    @Override
    public JLabel getLabel1() {
        return label1;
    }

    @Override
    public JTextField getTextField() {
        return textField;
    }

    @Override
    public void updateTimeLabel(int newTime) {
        timeLabel.setText("Tempo rimanente: " + newTime);
        timeLabel.revalidate();
        timeLabel.repaint();
    }
}
