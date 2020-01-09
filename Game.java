import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Game extends JFrame {
    protected JTextField textField;
    public Game() {
        setTitle("Game");
        setSize(1000, 500);
        setLayout(new BorderLayout());
        textField = new JTextField(20);
        final Canv canvas = new Canv();
        add(canvas, BorderLayout.CENTER);
        add(textField, BorderLayout.PAGE_END);
        textField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    String text = textField.getText();
                    canvas.updateGraphics(50, 50);
                    repaint();
                }
            });
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }
}

class Canv extends JPanel {
    private int x, y;
    private Color color = null;

    public Canv() {
        setBackground(Color.GRAY);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D drawImage = (Graphics2D) g;
        if (color != null) {
            drawImage.setColor(Color.red);
            drawImage.fillOval(getWidth()/2-25, getHeight()/2-25, 50, 50);
        }
    }

    public void updateGraphics(int length, int width) {
        color = Color.RED;
        x = length;
        y = width;
        repaint();
    }

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
/*import java.awt.*;
import javax.swing.*;

public class MapSystem extends Canvas {
    //Map map;
    //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public MapSystem() {   
        //this.map = new Map(6); 
        GameCanvas canvas = new GameCanvas();
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setSize(1000, 1000);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public class GameCanvas extends JComponent { 
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            //player character is currently a red circle.
            g2d.setColor(Color.red);
            g2d.fillOval(getWidth()/2-25, getHeight()/2-25, 50, 50);
            //render the map around the player character.
            /*get the current chamber the player is in.
            */
            /*get current location of the player, base the map around that using the width and height of the game frame
               for everything withing -width/2, +width/2, -height/2 and +height/2 around the player render it.
               */
              //System.out.println(map.getChamberXCoord(1));
        //}
   // }
//}*/