import java.rmi.server.SocketSecurityException;

import javax.xml.stream.XMLOutputFactory;

public class Character {
    private int hp = 10;
    private int def = 1;
    private String name;
    Weapon weapon;
    private int level;

    Character(){}
    Character(String name){
        this.name = name;
    }
    Character(int hp, String name, int level){
        this.hp = hp;
        this.name = name;
        this.level = level;
    }


    public String getName () {
        return name;
    }

    public void setHp (int hp) {
        this.hp = hp;
    }

    public void setDef (int def) {
        this.def = def;
    }

    public int getHp () {
        return hp;
    }

    public int getDef () {
        return def;
    }

    public int getLevel () {
        return level;
    }

    public void move (){
       System.out.println("Character move");
    }
}
