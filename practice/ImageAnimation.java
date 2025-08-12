import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageAnimation extends JFrame {
    private AnimationPanel panel;
    private JButton startBtn, stopBtn;
    private Thread animationThread;
    private volatile boolean running = false;

    public ImageAnimation() {
        setTitle("Image Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.YELLOW);

        panel = new AnimationPanel();
        add(panel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.setOpaque(false);
        startBtn = new JButton("Start Animation");
        stopBtn = new JButton("Stop Animation");
        btnPanel.add(startBtn);
        btnPanel.add(stopBtn);
        add(btnPanel, BorderLayout.SOUTH);

        startBtn.addActionListener(e -> startAnimation());
        stopBtn.addActionListener(e -> stopAnimation());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void startAnimation() {
        if (animationThread == null || !running) {
            running = true;
            animationThread = new Thread(panel::animate);
            animationThread.start();
        }
    }

    private void stopAnimation() {
        running = false;
    }

    class AnimationPanel extends JPanel {
        private int x = 50, y = 50, size = 80;
        private int dir = 0, step = 5;
        private int imgIndex = 0, msgIndex = 0;
        private String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
        private ImageIcon[] images;

        public AnimationPanel() {
            setOpaque(false);
            // You can replace these with your own images
            images = new ImageIcon[] {
                new ImageIcon("img1.jpg"),
                new ImageIcon("img2.jpg"),
                new ImageIcon("img3.jpg"),
                new ImageIcon("img4.jpg")
            };
        }

        public void animate() {
            while (running) {
                // Move in square: right, down, left, up
                switch (dir) {
                    case 0: x += step; if (x >= 350) dir = 1; break;
                    case 1: y += step; if (y >= 200) dir = 2; break;
                    case 2: x -= step; if (x <= 50) dir = 3; break;
                    case 3: y -= step; if (y <= 50) dir = 0; break;
                }
                imgIndex = (imgIndex + 1) % images.length;
                msgIndex = (msgIndex + 1) % messages.length;
                repaint();
                try { Thread.sleep(500); } catch (InterruptedException ex) { }
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.YELLOW);
            // Draw image
            if (images[imgIndex].getIconWidth() > 0)
                images[imgIndex].paintIcon(this, g, x, y);
            // Draw message
            g.setFont(new Font("Arial", Font.BOLD, 22));
            g.setColor(Color.BLACK);
            g.drawString(messages[msgIndex], getWidth()/2 - 60, getHeight()/2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageAnimation::new);
    }
}
