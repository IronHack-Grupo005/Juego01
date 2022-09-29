import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rpg.game.classes.Character;
import rpg.game.classes.Warrior;
import rpg.game.classes.Wizard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestMiguel {
    Warrior war, war2;
    Wizard wiz;

    @BeforeEach
    void setUP (){
        war = new Warrior(20);
        war2 = new Warrior(20);
        wiz = new Wizard(20);
    }

    @Test
    @DisplayName("Get attacked till die")
    void testWarrior_Kill_OK(){
        assertEquals("Warrior", war.dameType());
        assertTrue(war.hit(10) );
        assertTrue(war.hit(5));
        assertFalse(war.hit(5));
    }

    @Test
    @DisplayName("Attack a player till die")
    void testWarrior_Attack_OK () {
        assertTrue(wiz.attack(war));
        assertFalse(wiz.attack(war));
    }

/*
    @Test
    @DisplayName("Añadir un jugador a mas, debe lanzar excepcion")
    void testAdd_KO (){
        System.out.println(
                "!Nada por ahora" +
                assertThrows(RuntimeException.class, () -> {
                    //personas.añade("Miguelito", -10, "Desconocido");
                    //System.out.println( "La excpcion es: ");

                })
                .getMessage()
        )
        ;
    }
*/
}
