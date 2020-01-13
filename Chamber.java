import java.util.*;


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
