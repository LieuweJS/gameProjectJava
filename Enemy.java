import java.util.*;

public class Enemy {
    String Name;
    public int Health;
    Attack currentAttack;
    Random rand = new Random();
    int roll;
    ArrayList<Attack> Attacks = new ArrayList<Attack>();
    public Enemy(int EnemyType) {
        //tougher enemies are less likely to use ultimate attacks (the 40 damage ones)
        if(EnemyType == 0 || EnemyType == 1) {
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
            

        } else if(EnemyType == 2 || EnemyType == 3) {
            this.Name = "Janitor";
            this.Health = 150;
            Attacks.add(new Attack("Wet floor", 20));
            Attacks.add(new Attack("placeholder 2", 30));
            Attacks.add(new Attack("placeholder 3", 40));
            if (roll <= 40) {
                currentAttack = Attacks.get(0);
            }
            else if (roll > 40 && roll <= 70) {
                currentAttack = Attacks.get(1);
            }
            else if (roll > 70) {
                currentAttack = Attacks.get(2);
            }

        } else if(EnemyType == 4 || EnemyType == 5) {
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

        } else if(EnemyType == 6) {
            this.Name = "Manager";
            this.Health = 200;
            this.Attacks.add(new Attack("Employee Review", 25));
            this.Attacks.add(new Attack("Forced Overtime", 35));
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

 
    
}
