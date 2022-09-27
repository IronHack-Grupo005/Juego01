package rpg.game.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Party {

    final int ARRAY_SIZE = 2;
    private ArrayList<Character> characters = new ArrayList<Character>(ARRAY_SIZE);
    private Scanner key = new Scanner(System.in);

    public Party() { }

    public Character dameCaracter(int identificador){
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("#################");
        System.out.println("Estamos aqui con identificador: " + identificador);
        return (Character) this.characters.get(identificador);
        // TODO: Algo hay aqui ?
    }

    public boolean escojeGuerrero(String jugador){
        if(jugador == "Miguel") {
            System.out.println(jugador + " Escoje 1 para warrior 2 para mago!");
            String tecla = this.key.nextLine();

            if(tecla.compareTo("1") == 0){
                this.addWarrior();
                System.out.println("Has escogido un Warrior");
            } else if(tecla.compareTo("2") == 0){
                this.addWizard();
                System.out.println("Has escogido un Mago");
            } else {
                System.out.println("Esto .......");
                return false;
            }
        } else {
            // Si soy el ordenador, escopjo aleatorio Wizards or Warriors
            if ((int) ((Math.random() * (50 - 10)) + 10) / 2 == 0)
                this.addWarrior();
            else
                this.addWizard();
        }


        return true;
    }

    public boolean someoneAlive(){

        for( Character e: this.characters){
            if(e.isAlive()){
                return true;
            }
        }
        return false;
    }

    public boolean getVivos(){
        for( Character e: this.characters){
            if(e.isAlive()){
                System.out.println( "El id " + e.getIdentificador() + " es : " + e.getName()  );

            }
        }
        return true;
    }

    public int getFirstAlive(){
        int id = 0 ;
        for( Character e: this.characters){
            if(e.isAlive()){
                id = e.getIdentificador();
                return id;

            }
        }
        return id;
    }

    public boolean isFull (){
        if(this.characters.size() == ARRAY_SIZE)
            return true;
        return false;
    }

    public boolean addWarrior (){
        characters.add(new Warrior());
        return true;
    }

    public boolean addWizard (){
        characters.add(new Wizard());
        return true;
    }

}
