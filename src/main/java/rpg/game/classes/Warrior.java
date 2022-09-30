package rpg.game.classes;
import rpg.game.interfces.Attacker;

public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;
    private static long idWarrior = 0;
    public Warrior() {
        super();
        this.setStamina((int) ((Math.random() * (50 - 10)) + 10));
        this.setStrength((int) ((Math.random() * (10 - 1)) + 1));
        this.idWarrior += 1 ;

    }

    public Warrior(int hp) {
        super(hp);
        this.setStamina((int) ((Math.random() * (50 - 10)) + 10));
        this.setStrength((int) ((Math.random() * (10 - 1)) + 1));
        this.idWarrior += 1 ;
        //System.out.println("Creado en constructor de Warrior con id: " + this.idWarrior);

    }

    public static long getIdWarrior() {
        return idWarrior;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean attack(Character c) {
        this.setStamina(this.getStamina()-5);
        if (this.getStamina() >= 5) {
            return c.hit(this.getStrength()); // Heavy Attack
        } else {
            this.setStamina(this.getStamina() + 1);
            return c.hit((int) (this.getStrength() / 2)); // Weak Attack
        }
    }

}
