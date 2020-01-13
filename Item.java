public class Item {
        int Damage;
        int Healing;
        int Value;
        int Weight;
        public Item() {
            if(getRandomIntegerBetweenRange(0,1) == 1) {
                this.Damage = getRandomIntegerBetweenRange(20,35);
                this.Healing = 0;
                this.Value = getRandomIntegerBetweenRange(50,100);
                this.Weight = getRandomIntegerBetweenRange(0,2) + getRandomIntegerBetweenRange(0,10)/10;
            } else {
                this.Damage = 0;
                this.Healing = getRandomIntegerBetweenRange(20,35);
                this.Value = getRandomIntegerBetweenRange(50,100);
                this.Weight = getRandomIntegerBetweenRange(0,2) + getRandomIntegerBetweenRange(0,10)/10;
            }
        }

        public int getWeight() {return this.Weight;}
        
        public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    }