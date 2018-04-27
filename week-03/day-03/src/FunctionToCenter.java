
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        for (int i = 0; i <= 320; i+=20) {
                lineToCenter(graphics, i, 0);
                lineToCenter(graphics, i, 320);
                lineToCenter(graphics, 0, i);
                lineToCenter(graphics, 320, i);
        }

    }

    public static Graphics lineToCenter(Graphics graphics, int xCoord, int yCoord) {
        graphics.setColor(Color.BLACK);
        graphics.drawLine(160, 171, xCoord, yCoord);
        return graphics;
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}