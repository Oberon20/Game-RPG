public class Hero extends Character{
    // private int hp;
    int maxHp;
    // private int def;
    // private String name;
    public static int baseAtk;
    // Weapon weapon;
    // private int level;


    
    public void attack(Character ch){
        int hp1 = ch.getHp() - this.getLevel() * Hero.baseAtk + this.weapon.atk
        - ch.getDef() + this.weapon.randomAtk(this.weapon);
        setHp(hp1);
    }

    public void useWeapon(Weapon w){

    }

    public void defense(){
        int def1 = this.getDef() + Hero.baseAtk * getLevel() / 2;
        setDef(def1);
    }
 
    public void heal(){
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
            this.heal();
        } else {
            this.attack(null);
            this.attack(null);
            this.heal();
        }
        
    }

    @Override
    public void move (){
        System.out.println("Hero move");
    }

    public void move (String direction){
        System.out.println("Hero move to " + direction);
    }
}