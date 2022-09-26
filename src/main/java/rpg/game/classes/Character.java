package rpg.game.classes;

import java.util.ArrayList;

public abstract class Character {

    ArrayList<String> nombres = new ArrayList<String>(20);

    private static long id = 0;
    private int identificador ;

    private String name;
    private int hp;
    private boolean isAlive;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Character() {
        this.setName(rellenaConCaracteres((int) ((Math.random() * (25 - 1)) + 1)));
        this.setHp((int) ((Math.random() * (50 - 10)) + 10));
        this.setAlive(true);

        this.id ++ ;

        this.setIdentificador( (int) this.id);
        System.out.println("Creado algo con id: " + this.id);
    }

    public String dameType(){
        if(this instanceof Warrior)
            return "Warrior";
        else if(this instanceof Wizard)
            return "Wizard";
        else
            return "KO";
    }

    public void hit(int d) {
        this.hp -= d;
        if(this.getHp() <= 0)
            this.setAlive(false);
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Character.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    private String rellenaConCaracteres(int i){
        /* 25 */
        this.nombres.add("Miguel");
        this.nombres.add("Paco");
        this.nombres.add("Pepe");
        this.nombres.add("Pedrito");
        this.nombres.add("Manuel");
        this.nombres.add("Carlos");
        this.nombres.add("Anna");
        this.nombres.add("Maria");
        this.nombres.add("Josefina");
        this.nombres.add("Asuncio");
        this.nombres.add("Belen");
        this.nombres.add("Llorente");
        this.nombres.add("Pujol");
        this.nombres.add("Putin");
        this.nombres.add("Bush");
        this.nombres.add("Obama");
        this.nombres.add("Biden");
        this.nombres.add("Aniceto");
        this.nombres.add("Cenutrio");
        this.nombres.add("Panfleto");
        this.nombres.add("Unicornio");
        this.nombres.add("Roger");
        this.nombres.add("Copy");
        this.nombres.add("Contact");
        this.nombres.add("Pablo");

        return this.nombres.get(i);
    }

}

