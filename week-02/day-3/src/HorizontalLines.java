import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        int x = 0;
        int y = 81;
        for (int i = 0; i <= 2; i++) {
            DrawFunction(x, y, graphics);
            y += 30;
        }

    }

    public static void DrawFunction(int xCoord, int yCoord, Graphics graphics) {
        int horizonHolder = 50;
        graphics.drawLine(0, yCoord, xCoord + horizonHolder, yCoord);
    }




    public static void DrawF(int x1, int y1, Graphics graphics) {
        graphics.drawLine(x1, y1, WIDTH / 2, HEIGHT / 2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}