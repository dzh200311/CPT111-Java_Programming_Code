package cw1week01;

import java.awt.*;
import javax.swing.*;

public class SmallPerson extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the background color to white
        setBackground(Color.WHITE);

        // Set the dimensions of the person
        int x = 100;
        int y = 100;
        int width = 50;
        int height = 100;

        // Draw the head
        g.setColor(Color.PINK);
        g.fillOval(x + (width / 2) - 25, y, 50, 50);

        // Draw the body
        g.setColor(Color.BLUE);
        g.fillRect(x + (width / 2) - 25, y + 50, 50, 50);

        // Draw the arms
        g.setColor(Color.BLACK);
        g.drawLine(x, y + 25, x + 50, y + 75);
        g.drawLine(x + 100, y + 25, x + 50, y + 75);

        // Draw the legs
        g.drawLine(x + 25, y + 100, x + 25, y + 150);
        g.drawLine(x + 75, y + 100, x + 75, y + 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Small Person");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SmallPerson person = new SmallPerson();
        frame.add(person);

        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
