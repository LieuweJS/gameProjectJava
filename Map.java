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


    public void givePlayerRandomItem() {
    }


   
}