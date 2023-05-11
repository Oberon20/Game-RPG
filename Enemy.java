public class Enemy extends Character{
    // public int hp;
    int maxHp;
    // public int def;
    // public String name;
    public static int baseAtk;
    // Weapon weapon;
    // public int level;

    public void attack(Character ch){
        int hp1 = ch.getHp() - this.getLevel() * Enemy.baseAtk + this.weapon.atk
        - ch.getDef() + this.weapon.randomAtk(this.weapon);
        setHp(hp1);
    }

    public void useWeapon(Weapon w){

    }

    public void defense(){
        int def1 = this.getDef() + Hero.baseAtk * getLevel() / 2;
        setDef(def1);
    }

    public void remedy(){
        int hp1 = this.getHp() + 100;
        setHp(hp1);
    }

    public void doubleAttack(Character ch){
        this.attack(null);
        this.attack(null);
    }

    public void ultimate(Character ch){
        if (this.getHp() < 0.2 * this.maxHp) {
            this.attack(null);
            this.attack(null);
            this.attack(null);
            this.remedy();
        } else {
            this.attack(null);
            this.attack(null);
            this.remedy();
        }
        
    }

    @Override
    public void move (){
        System.out.println("Enemy move");
    }

    public void move ( int step){
        System.out.println("Enemy move " + step + " step");
    }
}
