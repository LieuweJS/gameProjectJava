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
    public Map() {

    }

    public class Chamber {
        int size = 5000;
        int ChamberNumber;
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        public Chamber(int ChamberNum) {

        }
    }

    public class Enemy {
        String Name;
        int Health;
        ArrayList<Attack> Attacks = new ArrayList<Attack>();
        public Enemy(int Health, int EnemyType) {
            if(EnemyType == 1) {
                this.Name = "IT Helpdesk Employee";
                this.Health = 100;
                this.Attacks.add(new Attack("Blackmail",20), new Attack("Hack",30), new Attack("",));
            } else if(EnemyType == 2) {
                this.Name = "Secretary";
                this.Health = 75;
                this.Attacks.add(new Attack("",), new Attack("",), new Attack("",));
            } else if(EnemyType == 3) {
                this.Name = "cafeteria employee";
                this.Health = 150;
                this.Attacks.add(new Attack("Coffee Break", 20), new Attack("",), new Attack("",));
            } else if(EnemyType == 4) {
                this.Name = "Manager";
                this.Health = 100;
                this.Attacks.add(new Attack("Employee Review", 20), new Attack("",), new Attack("You're Fired!",));
            }
        }
    }
    
    public class Attack {
        String Name; 
        int Damage;
        public Attack(String Name, int Damage) {
            this.Name = Name;
            this.Damage = Damage;
        }
    }

}