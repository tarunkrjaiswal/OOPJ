import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder input;
    private double num1, num2, result;
    private char operator;
    private boolean startNewNumber;

    public CalculatorGUI() {
        setTitle("CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        input = new StringBuilder();
        startNewNumber = true;

        // Display
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 18));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "*",
            "/", "0", "%", "=",
            "OFF", "", "", ""
        };
        for (String text : buttons) {
            if (text.equals("")) {
                panel.add(new JLabel());
            } else {
                JButton btn = new JButton(text);
                btn.setFont(new Font("Arial", Font.BOLD, 16));
                btn.addActionListener(this);
                panel.add(btn);
            }
        }
        add(panel, BorderLayout.CENTER);
        setSize(320, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.matches("[0-9]")) {
            if (startNewNumber) {
                input.setLength(0);
                startNewNumber = false;
            }
            input.append(cmd);
            display.setText(input.toString());
        }
        else if (cmd.matches("[+\\-*/%]")) {
            try {
                num1 = Double.parseDouble(display.getText());
            } catch (Exception ex) {
                num1 = 0;
            }
            operator = cmd.charAt(0);
            startNewNumber = true;
        }
        else if (cmd.equals("=")) {
            try {
                num2 = Double.parseDouble(display.getText());
            } catch (Exception ex) {
                num2 = 0;
            }
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num2 != 0 ? num1 / num2 : 0; break;
                case '%': result = num1 % num2; break;
                default: result = num2;
            }
            display.setText(String.valueOf(result));
            startNewNumber = true;
        }
        else if (cmd.equals("OFF")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorGUI());
    }
}
