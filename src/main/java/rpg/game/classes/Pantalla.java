package rpg.game.classes;

import java.util.Scanner;

public class Pantalla {

    private Scanner key = new Scanner(System.in);

    private String opcion1 = new String("1");
    private String opcion2 = new String("2");
    private static final String OPCION1 = "1";
    private static final String OPCION2 = "2";
    private static final String OPCION3 = "3";

    public void menuInicial () {
        System.out.println("El juego de Jabba");
        System.out.println("#################");
        System.out.println("Dala al enter");
        String tecla = this.key.nextLine();


    }

    public int menuEscogeAccion () {
        System.out.println("El juego de Jabba");
        System.out.println("#################");
        System.out.println("Escoje una opción, por favor!");
        System.out.println("1. Jugar");
        System.out.println("2. IA");
        System.out.println("3. Salir");

        String tecla = this.key.nextLine();

        if (tecla.isEmpty())
            return 0;

        if (tecla.compareTo(String.valueOf("3"))==0) {
            System.out.println("Que tenga un buen dia !!");
            return 3;
        } else if (tecla.compareTo(String.valueOf("2"))==0) {
            System.out.println("Si ... claro ...");
            return 2;
        }
        return 1;
    }

    public void menuTemporal () {
        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Centrate! que tu lo consigues...");
        System.out.println("Dala al enter");
        String tecla = this.key.nextLine();
    }


    public void menuDespedida () {
        System.out.println("\n\n");
        System.out.println("#####################");
        System.out.println("Be the peace with you");
        System.out.println("#####################");
    }

    public void menuCreadoEqp1 () {
        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Se ha creado tu equipo\ncreo el mio mucho mas rapido que tu\ndale al enter, porfa!");
        String tecla = this.key.nextLine();
    }

    public void menuCreadoEqp2 () {
        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Ya tengo mi equipo\ndale al enter, para jugar!");
        String tecla = this.key.nextLine();
    }

    public int menuEscoje (Party e) {
        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Escoje jugador");
        e.getVivos();

        System.out.println("#################");
        System.out.println("Espero su numero de jugador:");
        int tecla = this.key.nextInt();
        return tecla;
    }

    public void menuGanoMiguel () {
        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Gano Miguel !");
    }

    public void menuGanoPC () {
        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Gano el maldito ordenador !");
    }

    public void printX () {
        System.out.println("#################");
    }


}
