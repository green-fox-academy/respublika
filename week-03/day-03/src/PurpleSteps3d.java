
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        int grow=10;
        for (int i=0;i<=5;i++) {
            if (i==0) {
                graphics.setColor(new Color(180, 0, 255));
                graphics.fillRect(0 + grow, 0 + grow, grow, grow);
                grow += 10;
            } else {
                int grow2 = (grow*i)/2;
                graphics.setColor(new Color(180, 0, 255));
                graphics.fillRect(0 + grow2, 0 + grow2, grow, grow);
                grow += 10;
            }
        }

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