public class Hero {
    private String name;
    public int hitPoints;

    public Hero(String name){
        this.name = name;
        hitPoints = 100;
    }

    public String getName(){
        return name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public String toString(){
        return "Hero{name='" + name + "', hitPoints=" + hitPoints + "}";
    }
    public void attack(Hero opponent){
        double attack = Math.random();
        if (attack<0.5){
            this.hitPoints -= 10;
        }
        else{
            opponent.hitPoints -= 10;
        }
    }
    public void senzuBean(){
        hitPoints = 100;
    }
    private void fightUntilTheDeathHelper(Hero opponent){
        while (hitPoints >0 && opponent.hitPoints>0){
            attack(opponent);
        }
    }
    public String fightUntilTheDeath(Hero opponent){
        senzuBean();
        opponent.senzuBean();
        fightUntilTheDeathHelper(opponent);
        return name + ": " + hitPoints + "\t\t" + opponent.name + ": " + opponent.hitPoints;

    }
    private void nFightsToTheDeathHelper(Hero opponent, int n){

    }
    public String nFightsToTheDeath(Hero opponent, int n){
        int h = 0;
        int o = 0;
        while (n>0) {
            fightUntilTheDeathHelper(opponent);
            if (hitPoints==0){
                o++;
            }
            else {
                h++;
            }
            senzuBean();
            opponent.senzuBean();
            n = n - 1;
        }
        if (h==o){
            return name + ": " + h + " wins\n" + opponent.name + ": " + o + " wins\n" + "OMG! It was actually a draw!";
        }
        else if (h>o){
            return name + ": " + h + " wins\n" + opponent.name + ": " + o + " wins\n" + name + " wins!";
        }
        else{
            return name + ": " + h + " wins\n" + opponent.name + ": " + o + " wins\n" + opponent.name + " wins!";
        }
    }
    public void dramaticFightToTheDeath(Hero opponent){

    }
}
