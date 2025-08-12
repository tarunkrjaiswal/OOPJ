/* Design a registration form using Swing with following components 
on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

public class P1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(0, 2));

        // Label and Textbox for Name
        frame.add(new JLabel("Name:"));
        frame.add(new JTextField());

        // Label and Textbox for Email
        frame.add(new JLabel("Email:"));
        frame.add(new JTextField());

        // Label and TextArea for Address
        frame.add(new JLabel("Address:"));
        frame.add(new JTextArea());

        // Checkbox for Terms and Conditions
        frame.add(new JLabel("Accept Terms:"));
        frame.add(new JCheckBox());

        // Radio buttons for Gender
        frame.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.add(new JRadioButton("Male"));
        genderPanel.add(new JRadioButton("Female"));
        frame.add(genderPanel);

        // Button for Submit
        frame.add(new JButton("Submit"));

        // Image
        ImageIcon icon = new ImageIcon("path/to/image.jpg");
        frame.add(new JLabel(icon));

        frame.setVisible(true);
    }
}
