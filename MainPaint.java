import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class MainPaint extends JFrame {
    protected JTextField textField;
    public MainPaint() {
        setTitle("Game");
        setSize(1000, 500);
        setLayout(new BorderLayout());
        textField = new JTextField(20);

        final PaintPanel paintPan = new PaintPanel();
        add(paintPan, BorderLayout.CENTER);
        add(textField, BorderLayout.PAGE_END);
        textField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    String text = textField.getText();
                    paintPan.updateGraphics(50, 50);
                    repaint();
                }
            });
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainPaint();
    }
}

class PaintPanel extends JPanel {
    private int x, y;
    private Color color = null;

    public PaintPanel() {
        setBackground(Color.BLUE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D drawImage = (Graphics2D) g;
        if (color != null) {
            drawImage.setColor(color);
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