package Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyWordsTest {

    @Test
    void keyWordsCheck() {
        KeyWords keyword = new KeyWords();
        boolean resultado= keyword.keyWordsCheck("Don`t break my heart");
        System.out.println(resultado);
        boolean resultado2 = keyword.keyWordsCheck("I love breakdance");
        System.out.println(resultado2);

    }
}