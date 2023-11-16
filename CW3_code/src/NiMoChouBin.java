import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NiMoChouBin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ni Mo Chou Bin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NiMoChouBinPanel panel = new NiMoChouBinPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

class NiMoChouBinPanel extends JPanel {
    public NiMoChouBinPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the body of the Ni Mo Chou Bin
        g2d.setColor(Color.BLUE);
        g2d.fillOval(100, 100, 200, 200);

        // Draw the eyes
        g2d.setColor(Color.WHITE);
        g2d.fillOval(135, 135, 30, 30);
        g2d.fillOval(235, 135, 30, 30);

        // Draw the pupils
        g2d.setColor(Color.BLACK);
        g2d.fillOval(140, 140, 20, 20);
        g2d.fillOval(240, 140, 20, 20);

        // Draw the mouth
        g2d.setColor(Color.RED);
        g2d.drawArc(165, 185, 70, 50, 0, -180);
    }
}
