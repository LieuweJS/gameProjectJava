import java.util.*;
/**
 * Write a description of class Combat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Combat
{
    // instance variables - replace the example below with your own
    private int enemyHealth;
    private int playerHealth;
    private int playerDamage;
    Random rand = new Random();
    private boolean inCombat;
    private Attack currentAttack;
    ArrayList<Attack> EnemyAttacks = new ArrayList<Attack>();
    
    

    /**
     * Constructor for objects of class Combat
     */
    public Combat()
    {
        int enemytype = rand.nextInt(6);
        Enemy enemy = new Enemy(enemytype);
        enemyHealth = enemy.Health;
        EnemyAttacks = enemy.Attacks;
        
        inCombat = true;
        playerDamage = 10;
    }

    /**
     * 
     */
    public int getHealth()
    {
        return enemyHealth;
        
    }
    
    public void playerAttack() {
        enemyHealth = enemyHealth - playerDamage; 
    }
    
    public void enemyAttack() {
        int roll = rand.nextInt(99);
        if (roll <= 49) {
                currentAttack = EnemyAttacks.get(0);
            }
            else if (roll > 49 && roll <= 79) {
                currentAttack = EnemyAttacks.get(1);
            }
            else if (roll > 79) {
                currentAttack = EnemyAttacks.get(2);
            }
            playerHealth = playerHealth - currentAttack.Damage; 
    }
}
