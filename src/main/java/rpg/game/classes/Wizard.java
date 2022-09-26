package rpg.game.classes;
import rpg.game.interfces.Attacker;

public class Wizard extends Character implements Attacker {

    private int mana;
    private int intelligence;


    public Wizard(){
        super();
        this.setMana((int) ((Math.random() * (50 - 10)) + 10));
        this.setIntelligence((int) ((Math.random() * (50 - 10)) + 10));
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    public boolean attack(Character c) {
        this.setMana(this.getMana()-5);
        if (this.getMana() >= 5) {
            c.hit(this.getIntelligence()); // Heavy Attack
        } else {
            c.hit((int) (2)); // Weak Attack
            this.setMana(this.getMana() + 1);
        }
        return true;
    }

}

