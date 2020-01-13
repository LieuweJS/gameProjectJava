import java.util.*;

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

public class Map {
    Player player;
    ArrayList<Chamber> chamberList = new ArrayList<Chamber>();
    public Map() {
        this.player = new Player();
        this.addToBackLog();
        String[][] chamber1 = {
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
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
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
          String[][] chamber3 = {
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
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
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber4 = {
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
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
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
          String[][] chamber5 = {
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
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
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        String[][] chamber6 = {
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"},
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
        {"W","O","O","O","O","O","O","O","O","O","O","O","O","O","W"},
        {"W","W","W","W","W","W","W","W","W","W","W","W","W","W","W"}};
        
        this.chamberList.add(new Chamber(1, chamber1));
        this.chamberList.add(new Chamber(2, chamber2));
        this.chamberList.add(new Chamber(3, chamber3));
        this.chamberList.add(new Chamber(4, chamber4));
        this.chamberList.add(new Chamber(5, chamber5));
        this.chamberList.add(new Chamber(6, chamber6));
        
    }

    public void setPlayerX(int x) {
        this.player.setX(x);
    }

    public void setPlayerY(int y) {
        this.player.setY(y);
    }

    public int getPlayerX() {
        return this.player.getX();
    } 

    public int getPlayerY() {
        return this.player.getY();
    }

    public void compare(String input) {
        if(input.equals("go left")) {
            this.setPlayerX(-50);
            this.addToBackLog();
        } else if(input.equals("go right")) {
            this.setPlayerX(50);
            this.addToBackLog();
        } else if(input.equals("go up")) {
            this.setPlayerY(-50);
            this.addToBackLog();
        } else if(input.equals("go down")) {
            this.setPlayerY(+50);
            this.addToBackLog();
        } else if(input.equals("quit")) {
            System.exit(0);
        } else if(input.equals("back")) {
            this.back();
        } else if(input.equals("next floor")) {
            this.player.setCurrentFloor(1);
        } else if(input.equals("previous floor")) {
            this.player.setCurrentFloor(-1);      
        }
    }

    public void addToBackLog() {
        this.player.addToBackLog();
    }

    public void back() {
        this.player.back();
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
                        chamber.get(i).add(new GroundType("Wall"));
                    } else if(chamberMap[i][j] == "O") {
                        chamber.get(i).add(new GroundType("Open"));
                    } else if(chamberMap[i][j] == "C") {
                        chamber.get(i).add(new GroundType("Chest"));
                    } else if(chamberMap[i][j] == "P") {
                        chamber.get(i).add(new GroundType("PreviousFloorDoor"));
                    } else if(chamberMap[i][j] == "N") {
                        chamber.get(i).add(new GroundType("NextFloorDoor"));
                    } else if(chamberMap[i][j] == "E") {
                        chamber.get(i).add(new GroundType("Enemy"));
                    }
                }
            }
        }
        public String getGroundType(int i, int j) {return this.chamber.get(i).get(j).getGroundType();}
        public class GroundType {
            String GroundType;
            public GroundType(String type) {
                this.GroundType = type;
            }
            public String getGroundType() {return this.GroundType;}
        }
    }

    public void givePlayerRandomItem() {
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
        public Player() {
            this.x = 0;
            this.y = 0;
            this.Health = 200;
            this.maxWeight = 100.0;
            this.currentWeight = 0.0;
            this.currentFloor = 0;
        }

        public void setCurrentFloor(int floor) {
            this.currentFloor += floor;
        }

        public void addToBackLog() {
            this.xBackLog.add(this.x);
            this.yBackLog.add(this.y);
        }

        public void back() {
            this.xBackLog.remove(xBackLog.size()-1);
            this.yBackLog.remove(yBackLog.size()-1);
            this.x = xBackLog.get(xBackLog.size()-1);
            this.y = yBackLog.get(yBackLog.size()-1);
        }

        public void addToInventory() {
            Item item = new Item();
            if(addWeightPossible(item.getWeight()) == true) {
                this.inventory.add(item);
            }
        }

        public void setX(int x) {
            this.x += x;
        }

        public void setY(int y) {
            this.y += y;
        } 

        public int getX() {return this.x;}

        public int getY() {return this.y;}

        public boolean addWeightPossible(double weight) {
            if(this.currentWeight < this.maxWeight) {
                this.currentWeight += weight;
                return true;
            } else {
                return false;
            }
        }
    }

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

    public class Attack {
        String Name; 
        int Damage;
        public Attack(String Name, int Damage) {
            this.Name = Name;
            this.Damage = Damage;
        }
    }

    public class Item {
        int Damage;
        int Healing;
        int Value;
        int Weight;
        public Item() {
            if(getRandomIntegerBetweenRange(0,1) == 1) {
                this.Damage = getRandomIntegerBetweenRange(20,35);
                this.Healing = 0;
                this.Value = getRandomIntegerBetweenRange(50,100);
                this.Weight = getRandomIntegerBetweenRange(0,2) + getRandomIntegerBetweenRange(0,10)/10;
            } else {
                this.Damage = 0;
                this.Healing = getRandomIntegerBetweenRange(20,35);
                this.Value = getRandomIntegerBetweenRange(50,100);
                this.Weight = getRandomIntegerBetweenRange(0,2) + getRandomIntegerBetweenRange(0,10)/10;
            }
        }

        public int getWeight() {return this.Weight;}
    }

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}