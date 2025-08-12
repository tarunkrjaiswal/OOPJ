
import javax.swing.*;
import java.awt.*;

public class Stringhandler extends JFrame {
	private JTextField inputField, outputField;
	private JButton inCapsBtn, inSmallBtn, convertCaseBtn, wordsBtn, lettersBtn, reverseBtn, vowelsBtn, freqBtn, beginCapsBtn, resetBtn;

	public Stringhandler() {
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(new Color(255,182,193)); // light pink

		JLabel inputLabel = new JLabel("Enter the string:");
		inputLabel.setBounds(80, 60, 120, 25);
		add(inputLabel);

		inputField = new JTextField();
		inputField.setBounds(210, 60, 300, 25);
		add(inputField);

		JLabel outputLabel = new JLabel("String in upper case:");
		outputLabel.setBounds(80, 100, 140, 25);
		add(outputLabel);

		outputField = new JTextField();
		outputField.setBounds(230, 100, 280, 25);
		outputField.setEditable(false);
		add(outputField);

		// Buttons
		inCapsBtn = new JButton("IN CAPS");
		inSmallBtn = new JButton("IN SMALL");
		convertCaseBtn = new JButton("CONVERT CASE");
		wordsBtn = new JButton("WORDS");
		lettersBtn = new JButton("LETTERS");
		reverseBtn = new JButton("REVERSE");
		vowelsBtn = new JButton("VOWELS");
		freqBtn = new JButton("FREQUENCY");
		beginCapsBtn = new JButton("BEGIN CAPS");
		resetBtn = new JButton("RESET");

		JButton[] btns = {inCapsBtn, inSmallBtn, convertCaseBtn, wordsBtn, lettersBtn, reverseBtn, vowelsBtn, freqBtn, beginCapsBtn};
		int x = 30;
		int y = 180;
		for (int i = 0; i < btns.length; i++) {
			btns[i].setBounds(x, y, 120, 25);
			add(btns[i]);
			x += 130;
			if ((i+1)%5 == 0) { x = 30; y += 40; }
		}

		resetBtn.setBounds(250, y+40, 120, 30);
		resetBtn.setBackground(Color.BLUE);
		resetBtn.setForeground(Color.WHITE);
		add(resetBtn);

		// Button actions
		inCapsBtn.addActionListener(e -> outputField.setText(inputField.getText().toUpperCase()));
		inSmallBtn.addActionListener(e -> outputField.setText(inputField.getText().toLowerCase()));
		convertCaseBtn.addActionListener(e -> outputField.setText(convertCase(inputField.getText())));
		wordsBtn.addActionListener(e -> outputField.setText("Words: " + countWords(inputField.getText())));
		lettersBtn.addActionListener(e -> outputField.setText("Letters: " + countLetters(inputField.getText())));
		reverseBtn.addActionListener(e -> outputField.setText(new StringBuilder(inputField.getText()).reverse().toString()));
		vowelsBtn.addActionListener(e -> outputField.setText("Vowels: " + countVowels(inputField.getText())));
		freqBtn.addActionListener(e -> outputField.setText(charFrequency(inputField.getText())));
		beginCapsBtn.addActionListener(e -> outputField.setText(toBeginCaps(inputField.getText())));
		resetBtn.addActionListener(e -> {
			inputField.setText("");
			outputField.setText("");
		});

		setSize(700, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private String convertCase(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
			else if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
			else sb.append(c);
		}
		return sb.toString();
	}

	private int countWords(String s) {
		String[] words = s.trim().split("\\s+");
		return s.trim().isEmpty() ? 0 : words.length;
	}

	private int countLetters(String s) {
		int count = 0;
		for (char c : s.toCharArray()) if (Character.isLetter(c)) count++;
		return count;
	}

	private int countVowels(String s) {
		int count = 0;
		for (char c : s.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(c) >= 0) count++;
		}
		return count;
	}

	private String charFrequency(String s) {
		int[] freq = new int[256];
		for (char c : s.toCharArray()) freq[c]++;
		StringBuilder sb = new StringBuilder();
		for (char c = 0; c < 256; c++) {
			if (freq[c] > 0 && c != ' ') sb.append(c).append(":").append(freq[c]).append(" ");
		}
		return sb.toString().trim();
	}

	private String toBeginCaps(String s) {
		String[] words = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			if (word.length() > 0) sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Stringhandler());
	}
}
