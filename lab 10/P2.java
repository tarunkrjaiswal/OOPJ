/*-Write a GUI program in Java with three Labels – Enter the First 
Number, Enter the Second Number, Result, and three text fields for  - first number, second 
number and result and four buttons - Add, Sub, multiply and reset as shown below. On 
clicking of any of these buttons, the corresponding operation should be performed with 
input1 and input2 and the result should be displayed in the result box. 

Input: First and second number
 Output: Appropriate result will be displayed in the result text field */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class P2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(0, 2));

        // Labels
        frame.add(new JLabel("Enter First Number:"));
        JTextField input1 = new JTextField();
        frame.add(input1);

        frame.add(new JLabel("Enter Second Number:"));
        JTextField input2 = new JTextField();
        frame.add(input2);

        frame.add(new JLabel("Result:"));
        JTextField result = new JTextField();
        result.setEditable(false);
        frame.add(result);

        // Buttons
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Sub");
        JButton mulButton = new JButton("Multiply");
        JButton resetButton = new JButton("Reset");

        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(resetButton);

        // Button Actions
        addButton.addActionListener(e -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            result.setText(String.valueOf(num1 + num2));
        });

        subButton.addActionListener(e -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            result.setText(String.valueOf(num1 - num2));
        });

        mulButton.addActionListener(e -> {
            int num1 = Integer.parseInt(input1.getText());
            int num2 = Integer.parseInt(input2.getText());
            result.setText(String.valueOf(num1 * num2));
        });

        resetButton.addActionListener(e -> {
            input1.setText("");
            input2.setText("");
            result.setText("");
        });

        frame.setVisible(true);
    }
}

