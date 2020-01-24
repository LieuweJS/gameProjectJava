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
                {"W","O","O","O","O","O","O","O","O","O","W","O","C","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","W","O","O","O","W"},
                {"W","O","W","O","O","O","O","O","O","O","W","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","W","W","O","W","W"},
                {"W","O","O","W","O","O","O","O","O","O","O","W","O","O","W"},
                {"W","W","O","W","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","P","O","W","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","W","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","W","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","O","W","O","O","O","O","O","O","O","W"},
                {"W","O","W","O","W","O","O","W","O","O","O","O","O","O","W"},
                {"W","O","O","O","W","O","O","O","W","O","O","O","O","O","W"},
                {"W","O","O","O","W","O","O","C","W","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber3 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","W","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","W","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","W","O","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","W","O","O","N","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","W","O","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","W","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","W","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber4 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber5 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber6 = {
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","P","O","O","O","O","O","O","O","O","O","O","O","N","W"},
                {"W","W","O","O","O","O","O","O","O","O","O","O","O","W","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
                {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};

        this.chamberList.add(new Chamber(1, chamber1, "This is the first floor"));
        this.chamberList.add(new Chamber(2, chamber2, "This is the second floor"));
        this.chamberList.add(new Chamber(3, chamber3, "This is the third floor"));
        this.chamberList.add(new Chamber(4, chamber4, "This is the fourth floor"));
        this.chamberList.add(new Chamber(5, chamber5, "This is the fifth floor"));
        this.chamberList.add(new Chamber(6, chamber6, "This is the sixt floor"));

    }

    public void printInventory(JTextArea textArea) {
        for(int i = 0; i < this.player.inventory.size(); i++) {
            textArea.setText(this.player.itemToString(this.player.inventory.get(i)) + textArea.getText());
        }
    }

    public void compare(String input, String GroundType, JTextArea textArea) {
        if(this.player.inCombat == false) {
            if(input.equals("go left")) {
                if(!this.chamberList.get(this.getCurrentFloor()).getGroundType(this.getPlayerY()/50,(this.getPlayerX()/50)-1).equals("Wall")) {
                    this.setPlayerX(-50);
                    this.addToBackLog();
                    textArea.setText("Command 'go left' recognised: you have moved to the left.\n" + textArea.getText());
                    this.player.movesLeft -= 1;

                }
            } else if(input.equals("go right")) {
                if(!this.chamberList.get(this.getCurrentFloor()).getGroundType(this.getPlayerY()/50,(this.getPlayerX()/50)+1).equals("Wall")) {
                    this.setPlayerX(50);
                    this.addToBackLog();
                    textArea.setText("Command 'go right' recognised: you have moved to the right.\n" + textArea.getText());
                    this.player.movesLeft -= 1;

                }
            } else if(input.equals("go up")) {
                if(!this.chamberList.get(this.getCurrentFloor()).getGroundType((this.getPlayerY()/50)-1,this.getPlayerX()/50).equals("Wall")) {
                    this.setPlayerY(-50);
                    this.addToBackLog();
                    textArea.setText("Command 'go up' recognised: you have moved up.\n" + textArea.getText());
                    this.player.movesLeft -= 1;

                }
            } else if(input.equals("go down")) {
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
            } 
            else if(input.equals("open inventory")) {
                this.printInventory(textArea);
                textArea.setText("Command 'open inventory' recognised: these are the items currently in your inventory:\n" + textArea.getText());
            } else if(input.equals("clear console")) {
                textArea.setText("");
            } else if(input.equals("about")) {
                textArea.setText("lorum ipsum\n" + textArea.getText());
            } else if(input.equals("moves left")) {
                textArea.setText("command recognised: moves left: " + this.player.getMovesLeft() + "\n" + textArea.getText());
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
                textArea.setText("lorum ipsum\n" + textArea.getText());
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
                        this.player.damage += 30;
                        this.player.inventory.remove(i);
                        this.player.damageBoostersActive += 1;
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

    public class Chamber {
        int ChamberNumber;
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        // ArrayList<Item> items = new ArrayList<Item>();
        ArrayList<ArrayList<GroundType>> chamber = new ArrayList<>(15);
        String floorDescription;
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
                    }
                }
            }
        }

        public class GroundType {
            String GroundType;
            Color color;
            boolean empty;
            int enemyId;
            public GroundType(String type, Color color, int id) {
                this.GroundType = type;
                this.color = color;
                this.empty = false;
                this.enemyId = id;
            }

            public void setChestToEmpty() {
                this.empty = true;
            }

            public String getGroundType() {return this.GroundType;}

            public int getEnemyId() {return this.enemyId;}

            public boolean isChestEmpty() {return this.empty;}

            public Color getColor() {return this.color;}
        }

        public String getGroundType(int i, int j) {return this.chamber.get(i).get(j).getGroundType();}

        public void setChestToEmpty(int i, int j) {this.chamber.get(i).get(j).setChestToEmpty();}

        public boolean isChestEmpty(int i, int j) {return this.chamber.get(i).get(j).isChestEmpty();}

        public Color getColor(int i, int j) {return this.chamber.get(i).get(j).getColor();}

        public int getEnemyId(int i, int j) {return this.chamber.get(i).get(j).getEnemyId();}

        public String getFloorDescription() {return this.floorDescription;}
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
        int movesLeft;
        boolean inCombat;
        int damage;
        int damageBoostersActive;
        ArrayList<Item> inventory = new ArrayList<Item>();
        ArrayList<Integer> xBackLog = new ArrayList<Integer>();
        ArrayList<Integer> yBackLog = new ArrayList<Integer>();
        ArrayList<Integer> floorBackLog = new ArrayList<Integer>();
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
            this.movesLeft = 300;
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
                return itemToString(item);
            } else {
                return "this item is too heavy to fit into your inventory.";
            }
            //return itemToString(item);
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

        public int getMovesLeft() {return this.movesLeft;}
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
                this.Effect = 30;
                this.Weight = getRandomDoubleBetweenRange(1.0,2.0);
            } else {
                this.Type = "Healing";
                this.Effect = 50;
                this.Weight = getRandomDoubleBetweenRange(1.0, 2.0);
            }
        }

        public double getWeight() {return this.Weight;}
    }

    public class Enemy {
        String Name;
        int Health;
        Attack currentAttack;
        Random rand = new Random();
        int roll;
        ArrayList<Attack> Attacks = new ArrayList<Attack>();
        public Enemy(int EnemyType) {
            //tougher enemies are less likely to use ultimate attacks (the 40 damage ones)
            if(EnemyType == 1 || EnemyType == 2) {
                this.Name = "IT Helpdesk Employee";
                this.Health = 200;
                this.Attacks.add(new Attack("Blackmail Opponent", 20));
                this.Attacks.add(new Attack("Hack Opponent", 30));
                this.Attacks.add(new Attack("Remote Delete Opponent Files", 40));
                if (roll <= 50) {
                    currentAttack = Attacks.get(0);
                }
                else if (roll > 50 && roll <= 80) {
                    currentAttack = Attacks.get(1);
                }
                else if (roll > 80) {
                    currentAttack = Attacks.get(2);
                }

            } else if(EnemyType == 3 || EnemyType == 4) {
                this.Name = "Janitor";
                this.Health = 150;
                Attacks.add(new Attack("Wet floor", 20));
                Attacks.add(new Attack("Toilet plunger slash", 30));
                Attacks.add(new Attack("Slippery soap", 40));
                if (roll <= 40) {
                    currentAttack = Attacks.get(0);
                }
                else if (roll > 40 && roll <= 70) {
                    currentAttack = Attacks.get(1);
                }
                else if (roll > 70) {
                    currentAttack = Attacks.get(2);
                }

            } else if(EnemyType == 5 || EnemyType == 6) {
                this.Name = "Cafeteria employee";
                this.Health = 300;
                this.Attacks.add(new Attack("Coffee Break", 20));
                this.Attacks.add(new Attack("Lunch Throw", 30));
                this.Attacks.add(new Attack("Food Frenzy", 40));
                if (roll <= 60) {
                    currentAttack = Attacks.get(0);
                }
                else if (roll > 60 && roll <= 85) {
                    currentAttack = Attacks.get(1);
                }
                else if (roll > 85) {
                    currentAttack = Attacks.get(2);
                }

            } else if(EnemyType == 7) {
                this.Name = "Manager";
                this.Health = 200;
                this.Attacks.add(new Attack("Employee Review", 25));
                this.Attacks.add(new Attack("Unpaid Overtime", 35));
                this.Attacks.add(new Attack("You're Fired!", 45));
                if (roll <= 70) {
                    currentAttack = Attacks.get(0);
                }
                else if (roll > 70 && roll <= 90) {
                    currentAttack = Attacks.get(1);
                }
                else if (roll > 90) {
                    currentAttack = Attacks.get(2);
                }

            }
        }

        public int getEnemyHealth() {
            return this.Health;
        }
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