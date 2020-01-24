import java.util.*;
import java.awt.Color;
import javax.swing.*;
/**
 * this is chamber class, chambers are the floors of the game.
 * @author Lieuwe Baron.
 * @author Jan Udema.
 * @version 23/01/2020.
 */
public class Chamber{
    int ChamberNumber;
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    ArrayList<ArrayList<GroundType>> chamber = new ArrayList<>(15);
    String floorDescription;
    /**
     * the constrctor for the chamber class.
     * @param ChamberNum: the input for the number of the chamber.
     * @param chamberMap: the array input from which the map is generated.
     * @param description: the description of the chamber.
     */
    public Chamber(int ChamberNum, String[][] chamberMap, String description) {
        this.floorDescription = description;
        for(int i = 0; i < 15; i++) {
            chamber.add(new ArrayList());
            for(int j = 0; j < 15; j++) {
                if(chamberMap[i][j] == "W") {
                    chamber.get(i).add(new GroundType("Wall", Color.GRAY, -1));
                } else if(chamberMap[i][j] == "O") {
                    chamber.get(i).add(new GroundType("Open", Color.WHITE, -1));
                } else if(chamberMap[i][j] == "C") {
                    chamber.get(i).add(new GroundType("Chest", Color.YELLOW, -1));
                } else if(chamberMap[i][j] == "P") {
                    chamber.get(i).add(new GroundType("PreviousFloorDoor",Color.BLACK,-1));
                } else if(chamberMap[i][j] == "N") {
                    chamber.get(i).add(new GroundType("NextFloorDoor",Color.GREEN,-1));
                } else if(chamberMap[i][j] == "E") {
                    chamber.get(i).add(new GroundType("Enemy",Color.RED, enemies.size()));
                    enemies.add(new Enemy(getRandomIntegerBetweenRange(1,7)));
                }  else if(chamberMap[i][j] == "Q") {
                    chamber.get(i).add(new GroundType("End",Color.PINK, -1));
                }  else if(chamberMap[i][j] == "B") {
                    chamber.get(i).add(new GroundType("Boss",Color.ORANGE, enemies.size()));
                    enemies.add(new Enemy(8));
                }
            }
        }
    }
    /**
     * this is the subclass for the chamber class, it 
     */
    public class GroundType {
        String GroundType;
        Color color;
        boolean empty;
        int enemyId;
        /**
         * this is the constructor for the GroundType class.
         * @param type: this input determines the GroundType of the instance.  
         * @param color: this input determines the color of the instance.  
         * @param id: this input determines the id of the instance.  
         */
        public GroundType(String type, Color color, int id) {
            this.GroundType = type;
            this.color = color;
            this.empty = false;
            this.enemyId = id;
        }

        /**
         * this method sets the empty variable to true, indicating that the chest is empty.
         */
        public void setChestToEmpty() {this.empty = true;}

        /**
         * this method returns the groundType of the instance.
         * @return: returns the groundType of the instance.
         */
        public String getGroundType() {return this.GroundType;}

        /**
         * this method returns the enemyId of the instance.
         * @return: returns the enemyId of the instance
         */
        public int getEnemyId() {return this.enemyId;}

        /**
         * this method returns the empty variable of the GroundType instance.
         * @return: returns the empty variable, from this one can determine if the chest is empty or not.
         */
        public boolean isChestEmpty() {return this.empty;}

        /**
         * this method returns the color of the GroundType instance.
         * @return: returns the color of the GroundType instance.
         */
        public Color getColor() {return this.color;}
    }
    /**
     * this method gets the groundtype of a block based on its coordinates.
     * @param i: the first coordinate, used to find the right block that the player is referring to.
     * @param j: the second coordinate, used to find the right block that the player is referring to.
     * @return: returns the groundtype of a block based on its coordinates.
     */
    public String getGroundType(int i, int j) {return this.chamber.get(i).get(j).getGroundType();}

    /**
     * this method sets the chest the player is standing on to empty.
     * @param i: the first coordinate, used to find the right block that the player is referring to.
     * @param j: the second coordinate, used to find the right block that the player is referring to.
     */
    public void setChestToEmpty(int i, int j) {this.chamber.get(i).get(j).setChestToEmpty();}

    /**
     * this method sets a chest block to empty based on its coordinates.
     * @param i: the first coordinate, used to find the right block that the player is referring to.
     * @param j: the second coordinate, used to find the right block that the player is referring to.
     */
    public boolean isChestEmpty(int i, int j) {return this.chamber.get(i).get(j).isChestEmpty();}

    /**
     * this method returs the color of the block the player has requested.
     * @param i: the first coordinate, used to find the right block that the player is referring to.
     * @param j: the second coordinate, used to find the right block that the player is referring to.
     */
    public Color getColor(int i, int j) {return this.chamber.get(i).get(j).getColor();}

    /**
     * this method returns the id of the enemy the player is currently standing on.
     * @param i: the first coordinate, used to find the right block that the player is referring to.
     * @param j: the second coordinate, used to find the right block that the player is referring to.
     */
    public int getEnemyId(int i, int j) {return this.chamber.get(i).get(j).getEnemyId();}

    /**
     * this method returns the description of the chamber instance.
     * @return: returns the floor description.
     */
    public String getFloorDescription() {return this.floorDescription;}
    /**
     * this method generated a random integer between 2 given values.
     * @param min: the minimum value generated by this method.
     * @param max: the maximum value generated by this method.
     * @return: returns the random integer between the min and the max.
     */
    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}