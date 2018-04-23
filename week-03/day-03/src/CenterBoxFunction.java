
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        int[] w = {10, 20, 40};
        int[] h = {10, 20, 50};
        graphics=drawSquareToCenter(graphics, w, h);
        //check with lines if it's centered:
        //graphics.drawLine(320, 0, 320, 343);
        //graphics.drawLine(320, 343, 0, 343);
    }
    public static Graphics drawSquareToCenter(Graphics graphics, int[] w, int[] h) {
        graphics.setColor(Color.BLACK);
        for (int i=0;i<=2;i++) {
            int xCoord=160-(Math.round(w[i]/2));
            int yCoord=172-(Math.round(h[i]/2));;
            graphics.drawRect(xCoord, yCoord, w[i], h[i]);
        }
        return graphics;
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}