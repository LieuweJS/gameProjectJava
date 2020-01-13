import java.util.*;


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