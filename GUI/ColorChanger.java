

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger extends JFrame {

    private JPanel panel;
    private JButton redButton;
    private JButton blueButton;

    public ColorChanger() {
        setTitle("Color Changer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the window

        panel = new JPanel();
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");

        // Add buttons to panel
        panel.add(redButton);
        panel.add(blueButton);

        // Add panel to frame
        add(panel);

        // Add action listeners
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChanger frame = new ColorChanger();
            frame.setVisible(true);
        });
    }
}
