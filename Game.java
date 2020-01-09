import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main (String[]args) {
        JFrame jframe = new JFrame();
        JPanel jpanel = new JPanel();
        jframe.setSize(1000,1000);
        jpanel.setLayout(new BorderLayout());
        jframe.add(jpanel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpanel.add(new MapSystem());
        jframe.setVisible(true);
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