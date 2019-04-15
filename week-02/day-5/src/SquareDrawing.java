import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class SquareDrawing {
    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

        int widht = WIDTH;
        int height = HEIGHT;
        int x = 0;
        int y = 0;
        int count = 10;

        drawFourRectangle(count, x, y, widht, height, graphics);

    }
    public static void  drawFourRectangle(int count, int x, int y, int width, int height, Graphics graphics) {

        if (count > 0) {
            //int third = width / 3;
            graphics.drawRect(x, y, width, height);

    }
}
