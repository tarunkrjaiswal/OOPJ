import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class P3 {
    private static long startTime;
    private static boolean running = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stop Watch");
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");
        JLabel timeLabel = new JLabel("Time: 00:00:000", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    startTime = System.currentTimeMillis();
                    running = true;
                    new Thread(new TimerRunnable(timeLabel)).start();
                }
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = false;
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = false;
                timeLabel.setText("Time: 00:00:000");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        frame.setLayout(new BorderLayout());
        frame.add(timeLabel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on screen
        frame.setVisible(true);
    }

    private static class TimerRunnable implements Runnable {
        private JLabel label;

        public TimerRunnable(JLabel label) {
            this.label = label;
        }

        public void run() {
            while (running) {
                long elapsed = System.currentTimeMillis() - startTime;
                int minutes = (int) (elapsed / 60000);
                int seconds = (int) ((elapsed % 60000) / 1000);
                int milliseconds = (int) (elapsed % 1000);
                String timeStr = String.format("Time: %02d:%02d:%03d", minutes, seconds, milliseconds);
                label.setText(timeStr);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
