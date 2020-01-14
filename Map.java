import java.util.*;
import java.awt.Color;
import javax.swing.*;

public class Map {
    Player player;
    ArrayList<Chamber> chamberList = new ArrayList<Chamber>();
    public Map() {
        this.player = new Player();
        this.addToBackLog();
        String[][] chamber1 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"N","O","C","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","N"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber2 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"P","O","O","O","O","O","O","O","O","O","O","O","O","O","N"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber3 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"P","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","N"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber4 = {
                {"W","W","W","W","W","P","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","N","W","W"}};
        String[][] chamber5 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","P","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","N","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber6 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"P","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","N"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};

        this.chamberList.add(new Chamber(1, chamber1));
        this.chamberList.add(new Chamber(2, chamber2));
        this.chamberList.add(new Chamber(3, chamber3));
        this.chamberList.add(new Chamber(4, chamber4));
        this.chamberList.add(new Chamber(5, chamber5));
        this.chamberList.add(new Chamber(6, chamber6));

    }

    public void printInventory(JTextArea textArea) {
        for(int i = 0; i < this.player.inventory.size(); i++) {
            textArea.setText(this.player.itemToString(this.player.inventory.get(i)) + textArea.getText());
        }
    }

    public void compare(String input, String GroundType, JTextArea textArea) {
        if(input.equals("go left")) {
            if(!this.chamberList.get(this.getCurrentFloor()).getGroundType(this.getPlayerY()/50,(this.getPlayerX()/50)-1).equals("Wall")) {
                this.setPlayerX(-50);
                this.addToBackLog();
                textArea.setText("Command 'go left' recognised: you have moved to the left.\n" + textArea.getText());
            }
        } else if(input.equals("go right")) {
            if(!this.chamberList.get(this.getCurrentFloor()).getGroundType(this.getPlayerY()/50,(this.getPlayerX()/50)+1).equals("Wall")) {
                this.setPlayerX(50);
                this.addToBackLog();
                textArea.setText("Command 'go right' recognised: you have moved to the right.\n" + textArea.getText());
            }
        } else if(input.equals("go up")) {
            if(!this.chamberList.get(this.getCurrentFloor()).getGroundType((this.getPlayerY()/50)-1,this.getPlayerX()/50).equals("Wall")) {
                this.setPlayerY(-50);
                this.addToBackLog();
                textArea.setText("Command 'go up' recognised: you have moved up.\n" + textArea.getText());
            }
        } else if(input.equals("go down")) {
            if(!this.chamberList.get(this.getCurrentFloor()).getGroundType((this.getPlayerY()/50)+1,this.getPlayerX()/50).equals("Wall")) {
                this.setPlayerY(+50);
                this.addToBackLog();
                textArea.setText("Command 'go down' recognised: you have moved down.\n" + textArea.getText());
            }
        } else if(input.equals("quit")) {
            textArea.setText("Command 'quit' recognised: the game is shutting down.\n" + textArea.getText());
            System.exit(0);
        } else if(input.equals("back")) {
            this.back();
            textArea.setText("Command 'back' recognised: you have moved back to your previous location.\n" + textArea.getText());
        } else if(input.equals("next floor")) {
            textArea.setText("Command 'next floor' recognised: command not executed, you are not standing on a next floor door block.\n" + textArea.getText());
            if(GroundType.equals("NextFloorDoor")) {
                this.player.setCurrentFloor(1);
                this.hardSetPlayerX(50);
                this.hardSetPlayerY(50);
                this.player.addToBackLog();
                textArea.setText("Command 'next floor' recognised: you have moved to the next floor.\n" + textArea.getText());
            }    
        } else if(input.equals("previous floor")) {
            textArea.setText("Command 'previous floor' recognised: command not executed, you are not standing on a previous floor door block.\n" + textArea.getText());
            if(GroundType.equals("PreviousFloorDoor")) {
                this.player.setCurrentFloor(-1);
                this.hardSetPlayerX(50);
                this.hardSetPlayerY(50);
                this.player.addToBackLog();
                textArea.setText("Command 'previous floor' recognised: you have moved to the previous floor.\n" + textArea.getText());
            }
        } else if(input.equals("open chest")) {
            if(GroundType.equals("Chest")) {
                if( this.chamberList.get(this.getCurrentFloor()).isChestEmpty(this.getPlayerY()/50,this.getPlayerX()/50) == false) {
                    String item = this.player.addToInventory();
                    this.chamberList.get(this.getCurrentFloor()).setChestToEmpty(this.getPlayerY()/50,this.getPlayerX()/50);
                    //open chest and set to empty
                    textArea.setText(item + textArea.getText());
                    textArea.setText("Command 'open chest' recognised: you have opened the chest, the contents of the chest are:\n" + textArea.getText());
                } else {
                    textArea.setText("Command 'open chest' recognised: this chest is already empty.\n" + textArea.getText());
                }
            } else {
                textArea.setText("Command 'open chest' recognised: command not executed, you are not standing on a chest block.\n" + textArea.getText());
            }
        } else if(input.equals("open inventory")) {
            this.printInventory(textArea);
            textArea.setText("Command 'open inventory' recognised: these are the items currently in your inventory:\n" + textArea.getText());
        } else if(input.equals("clear console")) {
             textArea.setText("");
        } else {
            textArea.setText("Command not recognised.\n" + textArea.getText());
        }
    }

    public class Chamber {
        int ChamberNumber;
        // ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        // ArrayList<Item> items = new ArrayList<Item>();
        ArrayList<ArrayList<GroundType>> chamber = new ArrayList<>(15);
        public Chamber(int ChamberNum, String[][] chamberMap) {
            for(int i = 0; i < 15; i++) {
                chamber.add(new ArrayList());
                for(int j = 0; j < 15; j++) {
                    if(chamberMap[i][j] == "W") {
                        chamber.get(i).add(new GroundType("Wall", Color.GRAY));
                    } else if(chamberMap[i][j] == "O") {
                        chamber.get(i).add(new GroundType("Open", Color.WHITE));
                    } else if(chamberMap[i][j] == "C") {
                        chamber.get(i).add(new GroundType("Chest", Color.YELLOW));
                    } else if(chamberMap[i][j] == "P") {
                        chamber.get(i).add(new GroundType("PreviousFloorDoor",Color.BLACK));
                    } else if(chamberMap[i][j] == "N") {
                        chamber.get(i).add(new GroundType("NextFloorDoor",Color.GREEN));
                    } else if(chamberMap[i][j] == "E") {
                        chamber.get(i).add(new GroundType("Enemy",Color.RED));
                    }
                }
            }
        }

        public class GroundType {
            String GroundType;
            Color color;
            boolean empty;
            public GroundType(String type, Color color) {
                this.GroundType = type;
                this.color = color;
                this.empty = false;
            }

            public void setChestToEmpty() {
                this.empty = true;
            }

            public String getGroundType() {return this.GroundType;}

            public boolean isChestEmpty() {return empty;}

            public Color getColor() {return this.color;}
        }

        public String getGroundType(int i, int j) {return this.chamber.get(i).get(j).getGroundType();}

        public void setChestToEmpty(int i, int j) {this.chamber.get(i).get(j).setChestToEmpty();}

        public boolean isChestEmpty(int i, int j) {return this.chamber.get(i).get(j).isChestEmpty();}

        public Color getColor(int i, int j) {return this.chamber.get(i).get(j).getColor();}
    }

    public void givePlayerRandomItem(int i, int j) {
        if(this.chamberList.get(this.player.getCurrentFloor()).chamber.get(i).get(j).isChestEmpty() == false) {
            this.player.addToInventory();
        }
    }

    public class Player {
        int x;
        int y;
        int Health;
        double maxWeight;
        double currentWeight;
        int currentFloor;
        ArrayList<Item> inventory = new ArrayList<Item>();
        ArrayList<Integer> xBackLog = new ArrayList<Integer>();
        ArrayList<Integer> yBackLog = new ArrayList<Integer>();
        ArrayList<Integer> floorBackLog = new ArrayList<Integer>();
        public Player() {
            this.x = 50;
            this.y = 50;
            this.Health = 200;
            this.maxWeight = 100.0;
            this.currentWeight = 0.0;
            this.currentFloor = 0;
            this.addToInventory();
            this.addToInventory();
        }

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

        public String addToInventory() {
            Item item = new Item();
            if(addWeightPossible(item.getWeight()) == true) {
                this.inventory.add(item);
            }
            return itemToString(item);
        }

        public boolean addWeightPossible(double weight) {
            if(this.currentWeight < this.maxWeight) {
                this.currentWeight += weight;
                return true;
            } else {
                return false;
            }
        }
        
        public String itemToString(Item item) {
            return "Item: \n"+ "   "+item.Type + ": " + String.valueOf(item.Effect) + "\n    Weight: " + String.valueOf(item.Weight) + "\n";
        }

        public void addToBackLog() {
            this.xBackLog.add(this.x);
            this.yBackLog.add(this.y);
            this.floorBackLog.add(this.currentFloor);
        }
        
        public void setX(int x) {this.x += x;}

        public void setY(int y) {this.y += y;} 

        public int getX() {return this.x;}

        public int getY() {return this.y;}
        
        public void hardSetPlayerX(int x) {this.x = x;}

        public void hardSetPlayerY(int y) {this.y = y;}

        public void setCurrentFloor(int floor) {this.currentFloor += floor;}

        public int getCurrentFloor() {return this.currentFloor;}
    }

    public class Attack {
        String Name; 
        int Damage;
        public Attack(String Name, int Damage) {
            this.Name = Name;
            this.Damage = Damage;
        }
    }

    public class Item {
        String Type;
        int Effect;
        double Weight;
        public Item() {
            if(getRandomIntegerBetweenRange(0,1) == 1) {
                this.Type = "Damage";
                this.Effect = getRandomIntegerBetweenRange(20,35);
                this.Weight = getRandomDoubleBetweenRange(1.0,2.0);
            } else {
                this.Type = "Healing";
                this.Effect = getRandomIntegerBetweenRange(20,35);
                this.Weight = getRandomDoubleBetweenRange(1.0, 2.0);
            }
        }

        public double getWeight() {return this.Weight;}
    }

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = Math.round(((double)(Math.random()*((max-min)+1))+min) * 10)/10.0;
        return x;
    }
    
    public void setPlayerX(int x) {this.player.setX(x);}

    public void setPlayerY(int y) {this.player.setY(y);}

    public int getPlayerX() {return this.player.getX();} 

    public int getPlayerY() {return this.player.getY();}

    public int getCurrentFloor() {return this.player.getCurrentFloor();}

    public void hardSetPlayerX(int x) {this.player.hardSetPlayerX(x);}

    public void hardSetPlayerY(int y) {this.player.hardSetPlayerY(y);}

    public void addToBackLog() {this.player.addToBackLog();}

    public void back() {this.player.back();}
}

/*public class Map {
ArrayList<Chamber> chambers = new ArrayList<Chamber>();
ArrayList<Enemy> enemies = new ArrayList<Enemy>();
Player player;
int chamberNumbs;
public Map(int TotalChamberNumbs) {
this.chamberNumbs = 0;
for(int i = 0; i < TotalChamberNumbs; i++) {
Chamber newChamber = new Chamber(100, i);
this.chambers.add(chamberNumbs, newChamber);
this.chamberNumbs = i + 1;
}
this.generateMapLayout();
}

public int getChamberXCoord(int index) {
int returnValue = this.chambers.get(index).getChamberXCoord();
return returnValue;
}

public void setChamberXCoord(int index, int x) {
this.chambers.get(index).setChamberXCoord(x);
}

public int getChamberYCoord(int index) {
int returnValue = this.chambers.get(index).printChamberYCoord();
return returnValue;
}

public void setChamberYCoord(int index, int y) {
this.chambers.get(index).setChamberYCoord(y);
}

public class Chamber {
int chamberType;
int chamberNumber;
int xLen;
int yLen;
int xCoord;
int yCoord;
public Chamber(int chamberSize, int chamberNumb) {
this.chamberType = chamberSize;
this.xLen = (int) Math.round(Random(800,1200)+this.chamberType);
this.yLen = (int) Math.round(Random(800,1200)+this.chamberType);
this.xCoord = 0;
this.yCoord = 0;
this.chamberNumber = chamberNumb;
}

public int getChamberXCoord() {return this.xCoord;}

public int getChamberXLen() {return this.xLen;}

public void setChamberXCoord(int x) {this.xCoord = x;}

public int printChamberYCoord() {return this.yCoord;}

public int printChamberYLen() {return this.yLen;}

public void setChamberYCoord(int y) {this.yCoord = y;}

public int getChamberNr() {return this.chamberNumber;}
}

public class Enemy {
int Health;
public Enemy(){
this.Health = 0;
}

public void printEnemyHealth() {
System.out.println(this.Health);
}
}

public class Player {
int Health;
int locationY;
int locationX;
public Player() {
this.Health = 100;
this.locationY = 100;
this.locationX = 100;
}

public void printPlayerInfo() {
System.out.println("dd");
}

/*public void playerActionExecuter(String[] action) {
if(action[1] == "move") {
if(action[2] == "left") {this.locationX -= 50;}
else if(action[2] == "right") {this.locationX += 50;}
else if(action[2] == "up") {this.locationY += 50;}
else if(action[2] == "down") {this.locationY -= 50;}
} else if(action[1] == "open") {

}
}*/
/*}
public void generateGameWorld(int amountOfChambers) {
Map myMap = new Map(amountOfChambers);
System.out.println(myMap);
}

public int Random(int min, int max) {
int num = (int) Math.round(Math.random() * (max - min + 1) + min);
return num;
}

public void generateMapLayout() {
int totalIndex = 0;
int currX = 0;
for(int i = 0; i < this.chamberNumbs; i++) {
this.chambers.get(totalIndex).setChamberXCoord(currX+this.chambers.get(totalIndex).getChamberXLen());
currX = currX+this.chambers.get(totalIndex).getChamberXLen();
totalIndex++;
//System.out.println(this.chambers.get(totalIndex).getLevelNr());    
} 
}
}*/
/*  public class Enemy {
String Name;
int Health;
ArrayList<Attack> Attacks = new ArrayList<Attack>();
public Enemy(int Health, int EnemyType) {
//tougher enemies are less likely to use ultimate attacks (the 40 damage ones)
if(EnemyType == 1) {
this.Name = "IT Helpdesk Employee";
this.Health = 200;
this.Attacks.add(new Attack("Blackmail Opponent", 20), new Attack("Hack Opponent", 30), new Attack("Remote Delete Opponent Files", 40));
} else if(EnemyType == 2) {
this.Name = "jenator";
this.Health = 150;
this.Attacks.add(new Attack("", 20), new Attack("", 30), new Attack("", 40));
} else if(EnemyType == 3) {
this.Name = "cafeteria employee";
this.Health = 300;
this.Attacks.add(new Attack("Coffee Break", 20), new Attack("Lunch Throw", 30), new Attack("Food Frenzy", 40));
} else if(EnemyType == 4) {
this.Name = "Manager";
this.Health = 200;
this.Attacks.add(new Attack("Employee Review", 20), new Attack("Forced Overtime", 30), new Attack("You're Fired!", 40));
}
}
}*/
