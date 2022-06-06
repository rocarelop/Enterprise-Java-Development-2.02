package Player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void reduceLive() {
        Player player1 = new Player();
        System.out.println("Vida que tenia antes de aplicar el método: "+ player1.getLives());
        player1.reduceLive();
        System.out.println("Vida que tiene tras aplicar el método: " + player1.getLives());
    }

    @Test
    void attack() {
        Warrior warrior1 = new Warrior();
        Wizard wizard1 = new Wizard();

        System.out.println("La salud del wizard antes de aplicar el método: " + wizard1.getHealth());
        warrior1.attack(wizard1);
        System.out.println("La salud del wizard despues de aplicar el método: " + wizard1.getHealth());
    }
}