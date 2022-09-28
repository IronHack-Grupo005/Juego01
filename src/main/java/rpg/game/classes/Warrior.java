package rpg.game.classes;
import rpg.game.interfces.Attacker;

public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;

    public Warrior() {
        super();
        this.setStamina((int) ((Math.random() * (50 - 10)) + 10));
        this.setStrength((int) ((Math.random() * (10 - 1)) + 1));

    }

    public Warrior(int hp) {
        super(hp);
        this.setStamina((int) ((Math.random() * (50 - 10)) + 10));
        this.setStrength((int) ((Math.random() * (10 - 1)) + 1));

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
            c.hit(this.getStrength()); // Heavy Attack
        } else {
            c.hit((int) (this.getStrength() / 2)); // Weak Attack
            this.setStamina(this.getStamina() + 1);
        }
        return true;
    }

}
