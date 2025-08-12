/*-Implement a GUI application which consists of one List Box and 
one button. The list box will have four different color names. When the user will select a 
color from the list box and click on the button, the panel color will be changed to that 
color.
 Input: Select any color from the list box
 Output: Panel background color will be changed accordingly */

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setLayout(new BorderLayout());

        // Panel to change color
        javax.swing.JPanel colorPanel = new javax.swing.JPanel();
        colorPanel.setLayout(new BorderLayout());
        frame.add(colorPanel, BorderLayout.CENTER);

        // List Box
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        JList<String> colorList = new JList<>(colors);
        colorPanel.add(new JScrollPane(colorList), BorderLayout.WEST);

        // Button
        JButton selectButton = new JButton("Select Color");
        frame.add(selectButton, BorderLayout.SOUTH);

        // Action Listener
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();
                if (selectedColor != null) {
                    switch (selectedColor) {
                        case "Red":
                            colorPanel.setBackground(Color.RED);
                            break;
                        case "Green":
                            colorPanel.setBackground(Color.GREEN);
                            break;
                        case "Blue":
                            colorPanel.setBackground(Color.BLUE);
                            break;
                        case "Yellow":
                            colorPanel.setBackground(Color.YELLOW);
                            break;
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}
