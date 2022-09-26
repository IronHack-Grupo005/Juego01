package rpg.game;

import rpg.game.classes.Battle;
import rpg.game.classes.Pantalla;

public class Main {
    public static void main(String[] args) {

        System.out.println("El juego de Jabba");

        Pantalla menu = new Pantalla();

        Battle batalla = new Battle();

        batalla.run();

        System.out.println("@c 2022 - Miguel Quesada");

    }
}