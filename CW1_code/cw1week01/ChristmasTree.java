package cw1week01;

import java.awt.*;
import javax.swing.*;

public class ChristmasTree extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the background color to white
        setBackground(Color.WHITE);

        // Set the dimensions of the tree
        int x = 100;
        int y = 100;
        int width = 200;
        int height = 300;

        // Draw the trunk of the tree
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + (width / 2) - 10, y + height - 60, 20, 60);

        // Draw the branches of the tree
        g.setColor(Color.GREEN);
        g.fillOval(x, y, width, height);

        // Draw the ornaments on the tree
        for (int i = 0; i < 10; i++) {
            // Randomly generate the color of the ornament
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g.setColor(color);

            // Randomly generate the position of the ornament
            int ornamentX = (int) (Math.random() * width) + x;
            int ornamentY = (int) (Math.random() * height) + y;

            // Draw the ornament
            g.fillOval(ornamentX, ornamentY, 10, 10);
        }

        // Draw the star on top of the tree
        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[]{x + (width / 2), x + (width / 2) - 20, x + (width / 2) + 20},
                new int[]{y, y - 30, y}, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Christmas Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChristmasTree tree = new ChristmasTree();
        frame.add(tree);

        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}
