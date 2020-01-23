import java.util.*;


public class Enemy {
    String Name;
    int Health;
    ArrayList<Attack> Attacks = new ArrayList<Attack>();
    public Enemy(int Health, int EnemyType) {
        //tougher enemies are less likely to use ultimate attacks (the 40 damage ones)
        if(EnemyType == 1) {
            this.Name = "IT Helpdesk Employee";
            this.Health = 200;
            this.Attacks.add(new Attack("Blackmail Opponent", 20));
            this.Attacks.add(new Attack("Hack Opponent", 30));
            this.Attacks.add(new Attack("Remote Delete Opponent Files", 40));
        } else if(EnemyType == 2) {
            this.Name = "Janitor";
            this.Health = 150;
            Attacks.add(new Attack("Wet floor", 20));
            Attacks.add(new Attack("placeholder 2", 30));
            Attacks.add(new Attack("placeholder 3", 40));
        } else if(EnemyType == 3) {
            this.Name = "Cafeteria employee";
            this.Health = 300;
            this.Attacks.add(new Attack("Coffee Break", 20));
            this.Attacks.add(new Attack("Lunch Throw", 30));
            this.Attacks.add(new Attack("Food Frenzy", 40));
        } else if(EnemyType == 4) {
            this.Name = "Manager";
            this.Health = 200;
            this.Attacks.add(new Attack("Employee Review", 20));
            this.Attacks.add(new Attack("Forced Overtime", 30));
            this.Attacks.add(new Attack("You're Fired!", 40));
        }
    }
}
