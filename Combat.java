import java.util.*;
/**
 * this is the class for the Combat system
 *
 * @author Jan Udema.
 * @author Lieuwe Baron.
 * @version 23/01/2020.
 */
public class Combat
{
    Random rand = new Random();
    int playerHP;
    int playerDamage;
    int enemyHP;
    int enemyDamage1;
    int enemyDamage2; 
    int enemyDamage3;
    int enemyChance1;
    int enemyChance2;
    /**
     * this is the constructor for the Combat class.
     * @author Jan Udema.
     * @author Lieuwe Baron.
     * @param playerHP: this input determines the health that the player has in this combat instance.
     * @param playerDamage: this input determines the damage that the player does in this combat instance.
     * @param enemyHP: this input determines the health that the enemy has in this combat instance.
     * @param enemyDamage1: this input determines the damage of the first attack of the enemy in this combat instance.
     * @param enemyDamage2: this input determines the damage of the second attack of the enemy in this combat instance.
     * @param enemyDamage3: this input determines the damage of the third attack of the enemy in this combat instance.
     * @param enemyChance1: this input determines the chance of the first attack of the enemy in this combat instance.
     * @param enemyChance2: this input determines the chance of the second attack of the enemy in this combat instance.
     */
    public Combat(int playerHP, int playerDamage, int enemyHP, int enemyDamage1, int enemyDamage2, int enemyDamage3, int enemyChance1, int enemyChance2)
    {
        this.playerHP = playerHP;
        this.playerDamage = playerDamage;
        this.enemyHP = enemyHP;
        this.enemyDamage1 = enemyDamage1;
        this.enemyDamage2 = enemyDamage2;
        this.enemyDamage3 = enemyDamage3;
        this.enemyChance1 = enemyChance1;
        this.enemyChance2 = enemyChance2;
    }
    /**
     * this is the Attack method of the Combat class, it calculates the outcome of the battle.
     * @return resultArray: returns an array with the results of the battle.
     */
    public int[] Attack() {
        int currentAttack = 0;
        int roll = rand.nextInt(99);
        if (roll <= this.enemyChance1) {
                currentAttack = 0;
                this.playerHP -= enemyDamage1; 
            }
            else if (roll > this.enemyChance1 && roll <= this.enemyChance2) {
                currentAttack = 1;
                this.playerHP -= enemyDamage2; 
            }
            else if (roll > this.enemyChance2) {
                currentAttack = 2;
                this.playerHP -= enemyDamage3; 
            }
            this.enemyHP -= this.playerDamage;
            if(this.enemyHP < 0) {
                this.enemyHP = 0;
            }
            int[] resultArray = new int[]{this.playerHP, enemyHP, currentAttack};
             
            return resultArray;
    }
}
