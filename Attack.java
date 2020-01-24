/**
 * @author Jan Udema.
 * @version 23/01/2020.
 * this class generates an attack for the enemy class.
 */
public class Attack {
        String Name; 
        int Damage;
        int chance;
        /**
         * this is the constructor for the Attack class.
         * @param Name: this input determines the Name of the instance.
         * @param Damage: this input determines the Damage stat of the attack.
         * @param chance: determines the chance of the attack being rolled.
         */
        public Attack(String Name, int Damage, int chance) {
            this.Name = Name;
            this.Damage = Damage;
            this.chance = chance;
        }
    }