import java.awt.*;
import javax.swing.*;

public class MapSystem extends JPanel { 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        //player character is currently a red circle.
        g2d.setColor(Color.red);
        g2d.fillOval(getWidth()/2-25, getHeight()/2-25, 50, 50);
    }
}

