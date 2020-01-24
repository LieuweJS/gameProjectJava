import java.util.*;
import java.awt.Color;
import javax.swing.*;
/**
 * @author Lieuwe Baron.
 * @version 23/01/2020.
 * this is the player class
 */
public class Player {
    int x;
    int y;
    int Health;
    double maxWeight;
    double currentWeight;
    int currentFloor;
    int movesLeft;
    boolean inCombat;
    int damage;
    int damageBoostersActive;
    ArrayList<Item> inventory = new ArrayList<Item>();
    ArrayList<Integer> xBackLog = new ArrayList<Integer>();
    ArrayList<Integer> yBackLog = new ArrayList<Integer>();
    ArrayList<Integer> floorBackLog = new ArrayList<Integer>();
    /**
     * this is the constructor class for the player class.
     */
    public Player() {
        this.damageBoostersActive = 0;
        this.damage = 60;
        this.inCombat = false;
        this.x = 50;
        this.y = 350;
        this.Health = 200;
        this.maxWeight = 100.0;
        this.currentWeight = 0.0;
        this.currentFloor = 0;
        this.movesLeft = 50;
        this.addToInventory();
        this.addToInventory();
    }

    /**
     * this method is used for going back a move, it moves backwards through 3 arrays, the arrays are the dimensions of the game,
     * the x dimension, the y dimension, and the floor dimension. 
     * each time you use back, you delete the last item in each of these arrays, 
     * but before they are deleted, the player instanceś coordinates are set to the last item of each array.
     */
    public void back() {
        if(this.xBackLog.size() != 0 && this.yBackLog.size() != 0 && this.floorBackLog.size() != 0) {
            if(this.xBackLog.size() == 1 && this.yBackLog.size() == 1 && this.floorBackLog.size() == 1) {
                this.x = xBackLog.get(0);
                this.y = yBackLog.get(0);
                this.currentFloor = floorBackLog.get(0);
            } else {  
                this.xBackLog.remove(xBackLog.size()-1);
                this.yBackLog.remove(yBackLog.size()-1);
                this.floorBackLog.remove(floorBackLog.size()-1);
                this.x = xBackLog.get(xBackLog.size()-1);
                this.y = yBackLog.get(yBackLog.size()-1);
                this.currentFloor = floorBackLog.get(floorBackLog.size()-1);
            }
        }
    }

    /**
     * this method either adds the item that the player is in the process of obtaining to their inventory, then returns the stringified version of that item, 
     * or it returns that there is no more room in the inventory for that item.
     * @return: returns either the stringified version of the obtained item or returns that there is no more room in the inventory for that item.
     */
    public String addToInventory() {
        Item item = new Item();
        if(addWeightPossible(item.getWeight()) == true) {
            this.inventory.add(item);
            return itemToString(item);
        } else {
            return "this item is too heavy to fit into your inventory.";
        }
    }

    /**
     * this method returns if there is any more room in the inventory to store the item the player is in the process of obtaining.
     * @param weight: 
     */
    public boolean addWeightPossible(double weight) {
        if(this.currentWeight < this.maxWeight) {
            this.currentWeight += weight;
            return true;
        } else {
            return false;
        }
    }

    /**
     * this method returns the stringified version of an Item object.
     * "param item: the Item object that is to be stringified.
     * @return: returns the stringified version of the inputted Item object.
     */
    public String itemToString(Item item) {
        return "Item: \n"+ "   "+item.Type + ": " + String.valueOf(item.Effect) + "\n    Weight: " + String.valueOf(item.Weight) + "\n";
    }

    /**
     * this method adds the current x coordinate, y coordinate and current floor to their back arrays.
     */
    public void addToBackLog() {
        this.xBackLog.add(this.x);
        this.yBackLog.add(this.y);
        this.floorBackLog.add(this.currentFloor);
    }
    /**
     * this method adds the inserted parameter to the player instance's x coordinate.
     * @param x: the value to add up to the player x coordinate.
     */
    public void setX(int x) {this.x += x;}
    /**
     * this method adds the inserted parameter to the player instance's x coordinate.
     * @param y: the value to add up to the player y coordinate.
     */
    public void setY(int y) {this.y += y;} 
    /**
     * this method returns the player instance's x coordinate.
     * @return: returns the x coordinate of the player instance.
     */
    public int getX() {return this.x;}
    /**
     * this method returns the player instance's y coordinate.
     * @return: returns the y coordinate of the player instance.
     */
    public int getY() {return this.y;}
    /**
     * this method sets the player instance's x coordinate to the input.
     * @param x: the value to set the player x coordinate to.
     */
    public void hardSetPlayerX(int x) {this.x = x;}
    /**
     * this method sets the player instance's y coordinate to the input.
     * @param y: the value to set the player y coordinate to.
     */
    public void hardSetPlayerY(int y) {this.y = y;}
    /**
     * this method sets the player instance's x current floor to the input.
     * @param floor: the value to add up to the player current floor.
     */
    public void setCurrentFloor(int floor) {this.currentFloor += floor;}
    /**
     * this method returns the floor the player is currently on.
     * @return: returns the floor the player instance is currently on.
     */
    public int getCurrentFloor() {return this.currentFloor;}
    /**
     * this method returns the amount of moves you have left.
     * @return:  returns the amount of moves left.
     */
    public int getMovesLeft() {return this.movesLeft;}
}