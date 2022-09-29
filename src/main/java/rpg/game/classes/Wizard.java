package rpg.game.classes;
import rpg.game.interfces.Attacker;

public class Wizard extends Character implements Attacker {

    private int mana;
    private int intelligence;

    private static long idWizard = 0;
    public Wizard(){
        super();
        this.setMana((int) ((Math.random() * (50 - 10)) + 10));
        this.setIntelligence((int) ((Math.random() * (50 - 10)) + 10));
        this.idWizard += 1 ;
    }

    public Wizard(int hp){
        super(hp);
        this.setMana((int) ((Math.random() * (50 - 10)) + 10));
        this.setIntelligence((int) ((Math.random() * (50 - 10)) + 10));
        this.idWizard += 1 ;
        System.out.println("Creado en constructor de Wizard con id: " + this.idWizard);
    }

    public static long getIdWizard() {
        return idWizard;
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
            return c.hit(this.getIntelligence()); // Heavy Attack
        } else {
            this.setMana(this.getMana() + 1);
            return c.hit((int) (2)); // Weak Attack
        }
    }

}

