import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ElectricBaton extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the background color
        setBackground(Color.WHITE);

        // Draw the handle
        g.setColor(Color.GRAY);
        g.fillRect(100, 50, 50, 50);

        // Draw the body
        g.setColor(Color.BLACK);
        g.drawLine(125, 100, 125, 200);

        // Draw the prongs
        g.drawLine(110, 190, 140, 190);
        g.drawLine(110, 180, 140, 180);
        g.drawLine(110, 170, 140, 170);
        g.drawLine(110, 160, 140, 160);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new ElectricBaton());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
