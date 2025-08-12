import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P4 extends JFrame {
	private JComboBox<Integer> redBox, greenBox, blueBox;
	private JPanel colorPanel;

	public P4() {
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Top panel for controls
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		// Red
		JLabel redLabel = new JLabel("Red");
		redLabel.setForeground(Color.RED);
		topPanel.add(redLabel);
		redBox = new JComboBox<>();
		for (int i = 0; i <= 255; i++) redBox.addItem(i);
		topPanel.add(redBox);

		// Blue
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setForeground(Color.BLUE);
		topPanel.add(blueLabel);
		blueBox = new JComboBox<>();
		for (int i = 0; i <= 255; i++) blueBox.addItem(i);
		topPanel.add(blueBox);

		// Green
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setForeground(new Color(0,128,0));
		topPanel.add(greenLabel);
		greenBox = new JComboBox<>();
		for (int i = 0; i <= 255; i++) greenBox.addItem(i);
		topPanel.add(greenBox);

		// Button
		JButton showBtn = new JButton("Show-Output");
		topPanel.add(showBtn);

		add(topPanel, BorderLayout.NORTH);

		// Color panel
		colorPanel = new JPanel();
		colorPanel.setPreferredSize(new Dimension(400, 150));
		add(colorPanel, BorderLayout.CENTER);

		// Button action
		showBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = (Integer) redBox.getSelectedItem();
				int g = (Integer) greenBox.getSelectedItem();
				int b = (Integer) blueBox.getSelectedItem();
				colorPanel.setBackground(new Color(r, g, b));
			}
		});

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new P4());
	}
}
