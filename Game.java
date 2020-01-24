import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Game extends JFrame {
    protected JTextField textField;
    Map map;
    public Game() {
        this.map = new Map();
        setTitle("Game");
        setSize(750, 750);
        setLayout(new BorderLayout());
        textField = new JTextField(40);
        final Canv canvas = new Canv(map);
        add(canvas, BorderLayout.CENTER);
        add(textField, BorderLayout.PAGE_END);
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(700, 0));
        add(scrollPane, BorderLayout.EAST);
        textField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    String input = textField.getText();
                    map.compare(input, map.chamberList.get(map.getCurrentFloor()).getGroundType(map.getPlayerY()/50,map.getPlayerX()/50), textArea);
                    canvas.updateGraphics(50, 50);
                    textField.setText("");
                    repaint();
                    if(map.chamberList.get(map.getCurrentFloor()).getGroundType(map.getPlayerY()/50,map.getPlayerX()/50).equals("Enemy") || map.chamberList.get(map.getCurrentFloor()).getGroundType(map.getPlayerY()/50,map.getPlayerX()/50).equals("Boss")) {
                        if(map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Health != 0) {
                            if(map.player.inCombat == false) {
                                textArea.setText("Enemy Engaged!\n" + textArea.getText());
                                map.player.inCombat = true;
                            }                         
                            if(input.equals("use attack")) {  
                                int enemyHealth = map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Health;
                                int enemyDamage1 = map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Attacks.get(0).Damage;
                                int enemyDamage2 = map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Attacks.get(1).Damage;
                                int enemyDamage3 = map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Attacks.get(2).Damage;
                                String enemyAttack1 = map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Attacks.get(0).Name;
                                String enemyAttack2 = map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Attacks.get(1).Name;
                                String enemyAttack3 = map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Attacks.get(2).Name;
                                Combat combat = new Combat(map.player.Health,  map.player.damage, enemyHealth, enemyDamage1, enemyDamage2, enemyDamage3);
                                int[] newStats = combat.Attack();
                                String usedAttack = enemyAttack1;
                                if(newStats[2] == 0) {
                                    usedAttack = enemyAttack1;
                                } else if(newStats[2] == 1) {
                                    usedAttack = enemyAttack2;
                                } else if(newStats[2] == 2) {
                                    usedAttack = enemyAttack3;
                                }
                                map.player.Health = newStats[0];
                                map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Health = newStats[1];
                                String endResult = "";
                                if(newStats[0] <= 0) {
                                    System.exit(0);
                                } else if(newStats[1] <= 0) {
                                    endResult =  "You have killed the enemy \n";
                                    map.player.inCombat = false;
                                    map.player.damage -= (map.player.damageBoostersActive * 30);
                                    map.player.damageBoostersActive = 0;
                                    map.player.movesLeft += 25;
                                } else {
                                    endResult = "the enemy has struck back, using their " + usedAttack +
                                    " attack, your health is now: " + map.player.Health + "\n you have attacked the enemy, the enemies health is now: " + 
                                    map.chamberList.get(map.getCurrentFloor()).enemies.get(map.chamberList.get(map.getCurrentFloor()).getEnemyId(map.getPlayerY()/50,map.getPlayerX()/50)).Health + "\n";                       
                                }
                                textArea.setText(endResult+ textArea.getText());
                            }
                        }
                    }
                }
            });
        pack();      
        setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }

    class Canv extends JPanel {
        private int x, y;
        private Color color = null;
        Map map;
        public Canv(Map map) {
            this.map = map;
            setBackground(Color.BLUE);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D drawImage = (Graphics2D) g;
            for(int i = 0; i < 750; i+=50) {
                for(int j = 0; j < 750; j+= 50){
                    drawImage.setColor(map.chamberList.get(map.getCurrentFloor()).getColor(j/50,i/50));
                    drawImage.fillRect(i,j,50,50);
                    drawImage.setColor(color.BLACK);
                    drawImage.drawRect(i,j,50,50);
                }
            }
            drawImage.setColor(Color.BLUE);
            drawImage.fillOval(map.getPlayerX(),map.getPlayerY(), 50, 50);
        }

        public void updateGraphics(int length, int width) {
            color = Color.RED;
            x = length;
            y = width;
            repaint();
        }

    }
    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}