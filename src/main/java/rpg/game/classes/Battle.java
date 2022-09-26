package rpg.game.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Battle {

    //private ArrayList<Party> guerra = new ArrayList<Party>(2);

    private Party jugador1 = new Party();
    private Party jugador2 = new Party();
    private Pantalla menu = new Pantalla();

    private int fighterONE = 0;
    private int fighterTWO = 0;

    private int accion;

    public Battle() {}

    public boolean run(){
        /* Version mejorada del menu, que no funciona muy bien */
        /*
        do{
            accion = menu.menuEscogeAccion();
            if (accion != 3) {
                menu.menuTemporal();
            }
        }while(3 != accion);
        */
        menu.menuInicial();


        while (!jugador1.isFull()) {
            jugador1.escojeGuerrero("Miguel");
        }

        this.menu.menuCreadoEqp1();

        while (!jugador2.isFull()) {
            jugador2.escojeGuerrero("Ordenador");
        }

        menu.menuCreadoEqp2();

        do {

            int teclita = menu.menuEscoje(jugador1);
            System.out.println("Ha pulsado: " + teclita);

            this.setFighterONE( teclita );

            System.out.println("El ID es: " + jugador2.getFirstAlive());

            this.setFighterTWO(jugador2.getFirstAlive());

            // TODO: Porque no va la linea de abajo
            //(Warrior)jugador1.dameCaracter(this.getFighterONE()).attack(jugador2.dameCaracter(this.getFighterTWO()));

            if (jugador1.dameCaracter(this.getFighterONE()).dameType() == "Warrior") {
                Warrior war1 = (Warrior) jugador1.dameCaracter(this.getFighterONE());

                System.out.println("ID a ser atacado : " + this.getFighterTWO() + " de: " + this.getFighterONE() + " por Warrior");

                // TODO: Peta


                System.out.println( "Nombre: " + jugador2.dameCaracter(1).getName() );

                war1.attack(jugador2.dameCaracter(this.getFighterTWO()));


                System.out.println("Lucha Warrior " + war1.getName() + " con hp: " + war1.getHp());

            } else if (jugador1.dameCaracter(this.getFighterONE()).dameType() == "Wizard"){
                Wizard wiz1 = (Wizard) jugador1.dameCaracter(this.getFighterONE());
                System.out.println("ID a ser atacado : " + this.getFighterTWO() + " de: " + this.getFighterONE() + " por Wizard");

                //wiz1.attack(jugador2.dameCaracter(this.getFighterTWO()));

                System.out.println("Lucha Wizard " + wiz1.getName() + " con hp: " + wiz1.getHp());
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } while (jugador1.someoneAlive() && jugador2.someoneAlive());

        if (jugador1.someoneAlive()){
            menu.menuGanoMiguel();
        } else if (jugador2.someoneAlive()) {
            menu.menuGanoPC();
        } else {
            Scanner key = new Scanner(System.in);
            System.out.println("No gano nadie ??");
            String tecla = key.nextLine();
        }

        menu.menuDespedida();

        return true;
    }

    public int getFighterONE() {
        return fighterONE;
    }

    public void setFighterONE(int fighterONE) {
        this.fighterONE = fighterONE;
    }

    public int getFighterTWO() {
        return fighterTWO;
    }

    public void setFighterTWO(int fighterTWO) {
        this.fighterTWO = fighterTWO;
    }
}



