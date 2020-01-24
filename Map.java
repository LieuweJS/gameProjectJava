import java.util.*;
import java.awt.Color;
import javax.swing.*;
/**
 * this class is the basis of the entire game, it is used as a sort of hub for all the other classes.
 * it also generates the layout of the map.
 * @Author Lieuwe Baron.
 * @version 23/01/2020.
 */
public class Map {
    Player player;
    ArrayList<Chamber> chamberList = new ArrayList<Chamber>();
    /**
     * this is the constructor for the Map class.
     */
    public Map() {
        this.player = new Player();
        this.addToBackLog();
        String[][] chamber1 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","C","O","O","O","W","O","W","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","W","O","O","O","E","O","W","C","W"},
                {"W","O","O","O","O","O","W","W","W","W","O","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","E","W","O","O","O","O","O","O","O","O","W","W","W"},
                {"W","O","O","W","O","O","O","O","O","E","O","W","W","W","W"},
                {"W","O","O","W","O","O","O","O","O","O","O","W","W","W","W"},
                {"W","O","O","W","O","O","O","O","O","O","W","W","W","W","W"},
                {"W","C","O","W","O","O","O","O","O","O","W","W","W","W","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber2 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","C","O","O","O","O","O","O","O","O","W","E","C","E","W"},
                {"W","W","O","O","O","O","O","O","O","O","W","O","O","O","W"},
                {"W","O","W","O","O","O","O","O","O","O","W","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","W","W","O","W","W"},
                {"W","O","O","W","O","O","O","O","O","O","O","W","O","O","W"},
                {"W","W","O","W","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","P","O","W","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","W","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","W","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","E","W","O","O","O","O","O","O","O","W"},
                {"W","O","W","O","W","O","O","W","O","O","O","O","O","O","W"},
                {"W","O","O","O","W","O","O","O","W","O","O","O","O","O","W"},
                {"W","O","O","O","W","O","O","C","W","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber3 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","W","C","W","O","O","W","O","O","O","W"},
                {"W","O","O","W","O","O","O","W","O","O","W","O","E","O","W"},
                {"W","O","O","O","W","W","W","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","W","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","W","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","W","O","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","W","O","O","N","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","W","O","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","W","O","O","W"},
                {"W","O","O","O","W","O","O","O","O","O","O","O","W","O","W"},
                {"W","O","O","O","W","W","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","W","W","E","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","C","W","C","W","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber4 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","W","O","O","W","C","O","O","O","O","O","W"},
                {"W","W","O","O","O","W","O","W","O","O","O","O","O","O","W"},
                {"W","E","W","O","O","O","O","W","W","W","O","O","W","O","W"},
                {"W","O","W","O","O","O","W","W","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","O","O","O","W","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","O","W","W","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","E","W","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","W","O","W","O","O","O","O","W","W","W"},
                {"W","O","C","O","O","O","W","O","O","O","O","O","E","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","W","O","C","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber5 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","W","O","O","C","W"},
                {"W","C","O","W","O","O","O","O","O","O","W","O","O","O","W"},
                {"W","W","W","O","O","O","O","O","O","W","O","E","W","W","W"},
                {"W","O","W","O","O","O","O","O","O","W","O","W","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","O","O","W","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","W","W","O","O","O","O","O","W","W","O","W"},
                {"W","O","O","O","E","W","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","O","W","O","O","O","O","W","O","O","O","W"},
                {"W","O","O","O","W","O","O","O","O","O","W","O","O","C","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber6 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","C","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","W","O","O","O","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","W","W","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","C","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","O","O","B","Q","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","C","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","W","W","W"},
                {"W","O","O","O","O","O","O","W","O","O","O","W","W","W","W"},
                {"W","O","O","O","O","O","W","W","W","W","W","W","W","W","W"},
                {"W","C","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};

        this.chamberList.add(new Chamber(1, chamber1, "This is the first floor, you must get to the next floor. \n you may explore the area if you wish, killing enemies will grant you a higher score."));
        this.chamberList.add(new Chamber(2, chamber2, "This is the second floor, you must get to the next floor. \n you may explore the area if you wish, killing enemies will grant you a higher score."));
        this.chamberList.add(new Chamber(3, chamber3, "This is the third floor, you must get to the next floor. \n you may explore the area if you wish, killing enemies will grant you a higher score."));
        this.chamberList.add(new Chamber(4, chamber4, "This is the fourth floor, you must get to the next floor. \n you may explore the area if you wish, killing enemies will grant you a higher score."));
        this.chamberList.add(new Chamber(5, chamber5, "This is the fifth floor, you must get to the next floor. \n you may explore the area if you wish, killing enemies will grant you a higher score."));
        this.chamberList.add(new Chamber(6, chamber6, "This is the sixth floor, you must get to the next floor. \n you must defeat the final boss and claim your prizes"));

    }
    /**
     * method to write the contents of your inventory to the text area.
     * @param textArea: the text area, the function will be able to write to it now that it has this as an input.
     */
    public void printInventory(JTextArea textArea) {
        for(int i = 0; i < this.player.inventory.size(); i++) {
            textArea.setText(this.player.itemToString(this.player.inventory.get(i)) + textArea.getText());
        }
    }
    /**
     * method to see if the input string is the same as any commands, if this is true, that command is executed.
     * @param input: the text input that you are checking.
     * @param GroundType: the type of ground you are currently standing on.
     * @param textArea: the text area, the function will be able to write to it now that it has this as an input.
    */
    public void compare(String input, String GroundType, JTextArea textArea) {
        if(this.player.inCombat == false) {
            if(this.player.movesLeft <= 0) {
                System.exit(0);
            } 
            else if(this.player.movesLeft <= 20) {
                textArea.setText("moves left: " + this.player.movesLeft + " kill an enemy to aquire more moves\n" +textArea.getText());
            } if(input.equals("go left") || input.equals("l")) {
                if(!this.chamberList.get(this.getCurrentFloor()).getGroundType(this.getPlayerY()/50,(this.getPlayerX()/50)-1).equals("Wall")) {
                    this.setPlayerX(-50);
                    this.addToBackLog();
                    textArea.setText("Command 'go left' recognised: you have moved to the left.\n" + textArea.getText());
                    this.player.movesLeft -= 1;
                }
            } else if(input.equals("go right") || input.equals("r")) {
                if(!this.chamberList.get(this.getCurrentFloor()).getGroundType(this.getPlayerY()/50,(this.getPlayerX()/50)+1).equals("Wall")) {
                    this.setPlayerX(50);
                    this.addToBackLog();
                    textArea.setText("Command 'go right' recognised: you have moved to the right.\n" + textArea.getText());
                    this.player.movesLeft -= 1;
                }
            } else if(input.equals("go up") || input.equals("u")) {
                if(!this.chamberList.get(this.getCurrentFloor()).getGroundType((this.getPlayerY()/50)-1,this.getPlayerX()/50).equals("Wall")) {
                    this.setPlayerY(-50);
                    this.addToBackLog();
                    textArea.setText("Command 'go up' recognised: you have moved up.\n" + textArea.getText());
                    this.player.movesLeft -= 1;

                }
            } else if(input.equals("go down") || input.equals("d")) {
                if(!this.chamberList.get(this.getCurrentFloor()).getGroundType((this.getPlayerY()/50)+1,this.getPlayerX()/50).equals("Wall")) {
                    this.setPlayerY(+50);
                    this.addToBackLog();
                    textArea.setText("Command 'go down' recognised: you have moved down.\n" + textArea.getText());
                    this.player.movesLeft -= 1;

                }
            } else if(input.equals("quit")) {
                textArea.setText("Command 'quit' recognised: the game is shutting down.\n" + textArea.getText());
                System.exit(0);
            } else if(input.equals("back")) {
                this.back();
                textArea.setText("Command 'back' recognised: you have moved back to your previous location.\n" + textArea.getText());
                this.player.movesLeft -= 1;
            } else if(input.equals("next floor")) {
                textArea.setText("Command 'next floor' recognised: command not executed, you are not standing on a next floor door block.\n" + textArea.getText());
                if(GroundType.equals("NextFloorDoor")) {
                    this.player.setCurrentFloor(1);
                    this.hardSetPlayerX(50);
                    this.hardSetPlayerY(350);
                    this.player.addToBackLog();
                    textArea.setText("Command 'next floor' recognised: you have moved to the next floor.\n" + textArea.getText());
                    textArea.setText(this.chamberList.get(this.player.getCurrentFloor()).getFloorDescription() + "\n" + textArea.getText());
                    this.player.movesLeft -= 1;
                }    
            } else if(input.equals("previous floor")) {
                textArea.setText("Command 'previous floor' recognised: command not executed, you are not standing on a previous floor door block.\n" + textArea.getText());
                if(GroundType.equals("PreviousFloorDoor")) {
                    this.player.setCurrentFloor(-1);
                    this.hardSetPlayerX(50);
                    this.hardSetPlayerY(350);
                    this.player.addToBackLog();
                    textArea.setText("Command 'previous floor' recognised: you have moved to the previous floor.\n" + textArea.getText());
                    textArea.setText(this.chamberList.get(this.player.getCurrentFloor()).getFloorDescription() + "\n" + textArea.getText());
                    this.player.movesLeft -= 1;
                }
            } else if(input.equals("open chest")) {
                if(GroundType.equals("Chest")) {
                    if( this.chamberList.get(this.getCurrentFloor()).isChestEmpty(this.getPlayerY()/50,this.getPlayerX()/50) == false) {
                        int numberOfItemsInChest = getRandomIntegerBetweenRange(1,3); 
                        for(int i = 0; i < numberOfItemsInChest; i++) {
                            String item = this.player.addToInventory();
                            textArea.setText(item + textArea.getText());
                        } 
                        this.chamberList.get(this.getCurrentFloor()).setChestToEmpty(this.getPlayerY()/50,this.getPlayerX()/50);
                        textArea.setText("Command 'open chest' recognised: you have opened the chest, the contents of the chest are:\n" + textArea.getText());
                    } else {
                        textArea.setText("Command 'open chest' recognised: this chest is already empty.\n" + textArea.getText());
                    }
                } else {
                    textArea.setText("Command 'open chest' recognised: command not executed, you are not standing on a chest block.\n" + textArea.getText());
                }
            } else if(input.equals("use healing")) {
                boolean found = false;
                for(int i = 0; i < this.player.inventory.size(); i++) {
                    if(this.player.inventory.get(i).Type.equals("Healing")) {
                        this.player.Health += 60;
                        this.player.inventory.remove(i);
                        textArea.setText("you have used a healing item, your health is now: "+ this.player.Health + "\n" + textArea.getText());
                        found = true;
                        break;
                    }
                } 
                if(found == false) {
                    textArea.setText("there are no health items in your inventory \n" + textArea.getText());
                }
            }else if(input.equals("open inventory")) {
                this.printInventory(textArea);
                textArea.setText("Command 'open inventory' recognised: these are the items currently in your inventory:\n" + textArea.getText());
            } else if(input.equals("clear console")) {
                textArea.setText("");
            } else if(input.equals("about")) {
                String about = "You are an overworked employee at an unnamed office building,\n" + 
                "You are an overworked employee at an unnamed office building, \n"+
                "but at 2 hours before your shift is done you hear of great news. \n"+
                "The sandwich shop on the other side of street is selling sandwiches at a 50% discount.\n"+
                "supplies are limited however. \n"+
                "and thus you must escape your office building at any cost while ensuring that the other employees and your boss do not get any of YOUR sandwiches.\n"+
                "You must use various office supplies to descend floors until you reach the ground floor exit, where you must face your boss.\n"+
                "There is a limited amount of turns you can take before all the sandwiches are sold out.\n"+
                "Fighting your fellow employees will increase that time as it means less competition.\n"+
                "There are items to be found in chest that can help you. \n"+
                "The more turns you have left at the end of the game, the more sandwiches you will be able to buy.\n"+
                "This determines your score. If you run out of moves it is Game Over!\n";
                textArea.setText(about + textArea.getText());
            } else if(input.equals("moves left")) {
                textArea.setText("command recognised: moves left: " + this.player.getMovesLeft() + "\n" + textArea.getText());
            } else if(input.equals("complete quest")) {
                if(GroundType.equals("End")) {
                     textArea.setText("you have finished the game, your score was: " + this.player.movesLeft + "\n"+ textArea.getText());
                }
            } else if(input.equals("add moves")) {
                this.player.movesLeft += 10;
                 textArea.setText("Command recognised: added 10 moves.\n" + textArea.getText());
            } else {
                textArea.setText("Command not recognised.\n" + textArea.getText());
            }
        } else {
            if(input.equals("open inventory")) {
                this.printInventory(textArea);
                textArea.setText("Command 'open inventory' recognised: these are the items currently in your inventory:\n" + textArea.getText());
            } else if(input.equals("clear console")) {
                textArea.setText("");
            } else if(input.equals("about")) {
                String about = "You are an overworked employee at an unnamed office building,\n" + 
                "You are an overworked employee at an unnamed office building, \n"+
                "but at 2 hours before your shift is done you hear of great news. \n"+
                "The sandwich shop on the other side of street is selling sandwiches at a 50% discount.\n"+
                "supplies are limited however. \n"+
                "and thus you must escape your office building at any cost while ensuring that the other employees and your boss do not get any of YOUR sandwiches.\n"+
                "You must use various office supplies to descend floors until you reach the ground floor exit, where you must face your boss.\n"+
                "There is a limited amount of turns you can take before all the sandwiches are sold out.\n"+
                "Fighting your fellow employees will increase that time as it means less competition.\n"+
                "There are items to be found in chest that can help you. \n"+
                "The more turns you have left at the end of the game, the more sandwiches you will be able to buy.\n"+
                "This determines your score. If you run out of moves it is Game Over!\n";
                textArea.setText(about + textArea.getText());
            } else if(input.equals("moves left")) {
                textArea.setText("command recognised: moves left: " + this.player.getMovesLeft() + "\n" + textArea.getText());
            }  else if(input.equals("quit")) {
                textArea.setText("Command 'quit' recognised: the game is shutting down.\n" + textArea.getText());
                System.exit(0);
            } else if(input.equals("use attack")) {
            } else if(input.equals("use healing")) {
                boolean found = false;
                for(int i = 0; i < this.player.inventory.size(); i++) {
                    if(this.player.inventory.get(i).Type.equals("Healing")) {
                        this.player.Health += 60;
                        this.player.inventory.remove(i);
                        textArea.setText("you have used a healing item, your health is now: "+ this.player.Health + "\n" + textArea.getText());
                        found = true;
                        break;
                    }
                } 
                if(found == false) {
                    textArea.setText("there are no health items in your inventory \n" + textArea.getText());
                }
            } else if(input.equals("use damage boost")) {
                boolean found = false;
                for(int i = 0; i < this.player.inventory.size(); i++) {
                    if(this.player.inventory.get(i).Type.equals("Damage")) {
                        this.player.damage += 30;
                        this.player.inventory.remove(i);
                        this.player.damageBoostersActive += 1;
                        textArea.setText("you have used a damage booster, your damage is now: "+ this.player.damage + " for the remainder of the battle\n" + textArea.getText());
                        found = true;
                        break;
                    }
                } 
                if(found == false) {
                    textArea.setText("there are no damage boosters in your inventory \n" + textArea.getText());
                }
            } else {
                textArea.setText("Command not recognised.\n" + textArea.getText());
            }
        }

    }
    /**
     * this method gives the player a random item, assuming that the chest that you are standing on is empty.
     * @param i: first input coordinate, used to find the correct groundType you are standing on.
     * @param j: second input coordinate, used to find the correct groundType you are standing on.
     */
    public void givePlayerRandomItem(int i, int j) {
        if(this.chamberList.get(this.player.getCurrentFloor()).chamber.get(i).get(j).isChestEmpty() == false) {
            this.player.addToInventory();
        }
    }
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
    /**
     * this method generated a random double between 2 given values.
     * @param min: the minimum value generated by this method.
     * @param max: the maximum value generated by this method.
     * @return: returns the random double between the min and the max.
     */
    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = Math.round(((double)(Math.random()*((max-min)+1))+min) * 10)/10.0;
        return x;
    }
    /**
     * this method is used to execute the setPlayerX method in the player instance.   
     * @param x: the value to add up to the player x coordinate.
     */
    public void setPlayerX(int x) {this.player.setX(x);}
    /**
     * this method is used to execute the setPlayerY method in the player instance.   
     * @param y: the value to add up to the player y coordinate.
     */
    public void setPlayerY(int y) {this.player.setY(y);}
    /**
     * this method returns the result of this.player.getX().
     * @return: returs the result of this.player.getX().
     */
    public int getPlayerX() {return this.player.getX();} 
    /**
     * this method returns the result of this.player.getY().
     * @return: returs the result of this.player.getY().
     */    
    public int getPlayerY() {return this.player.getY();}
    /**
     * this method returns the result of this.player.getCurrentFloor().
     * @return: returs the result of this.player.getCurrentFloor().
     */    
    public int getCurrentFloor() {return this.player.getCurrentFloor();}
    /**
     * this method is used to execute the hardSetPlayerX method in the player instance.   
     * @param x: the value to set the player x coordinate to.
     */   
    public void hardSetPlayerX(int x) {this.player.hardSetPlayerX(x);}
    /**
     * this method is used to execute the hardSetPlayerY method in the player instance.   
     * @param y: the value to set the player y coordinate to.
     */      
    public void hardSetPlayerY(int y) {this.player.hardSetPlayerY(y);}
    /**
     * this method executes the addToBackLog method in the player instance.
     */   
    public void addToBackLog() {this.player.addToBackLog();}
    /** 
     * this method executes the back method in the player instance.
     */
    public void back() {this.player.back();}
}