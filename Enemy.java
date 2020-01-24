import java.util.*;
import java.awt.Color;
import javax.swing.*;
/**
 * @author Jan Udema.
 * @author Lieuwe Baron.
 * @version 23/01/2020.
 */
public class Enemy {
        String Name;
        int Health;
        Attack currentAttack;
        Random rand = new Random();
        int roll;
        ArrayList<Attack> Attacks = new ArrayList<Attack>();
        /**
         * this is the constructor for the enemy class.
         * @param EnemyType: this input decides the type of the enemy instance.
         */
        public Enemy(int EnemyType) {
            if(EnemyType == 1 || EnemyType == 2) {
                this.Name = "IT Helpdesk Employee";
                this.Health = 200;
                this.Attacks.add(new Attack("Blackmail Opponent", 20, 49));
                this.Attacks.add(new Attack("Hack Opponent", 30, 79));
                this.Attacks.add(new Attack("Remote Delete Opponent Files", 40, 99));
            } else if(EnemyType == 3 || EnemyType == 4) {
                this.Name = "Janitor";
                this.Health = 150;
                Attacks.add(new Attack("Wet floor", 20, 39));
                Attacks.add(new Attack("Toilet plunger slash", 30, 69));
                Attacks.add(new Attack("Slippery soap", 40, 99));
            } else if(EnemyType == 5 || EnemyType == 6) {
                this.Name = "Cafeteria employee";
                this.Health = 300;
                this.Attacks.add(new Attack("Coffee Break", 20, 59));
                this.Attacks.add(new Attack("Lunch Throw", 30, 84));
                this.Attacks.add(new Attack("Food Frenzy", 40, 99));    
            } else if(EnemyType == 7) {
                this.Name = "Manager";
                this.Health = 200;
                this.Attacks.add(new Attack("Employee Review", 25, 69));
                this.Attacks.add(new Attack("Unpaid Overtime", 35, 89));
                this.Attacks.add(new Attack("You're Fired!", 45, 99));
            } else if(EnemyType == 8) {
                this.Name = "Boss";
                this.Health = 350;
                this.Attacks.add(new Attack("Budget cuts", 30, 69));
                this.Attacks.add(new Attack("Mayor stakeholder", 45, 89));
                this.Attacks.add(new Attack("4-fold bash of office chair", 60, 99));
            }
        }
        /**
         * this method returns the health of the enemy.
         * @return: returns the health of the enemy.
         */
        public int getEnemyHealth() {
            return this.Health;
        }
    }