package Clases;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddTest {

    @org.junit.jupiter.api.Test
    void testodd() {
        MyArray array1 = new MyArray();
        int n = 99;
        int[] resultado = array1.odds(n);
        for(int num : resultado){
            if(num%2==0){
                System.out.println("Error:Hay un numero par " + num);
            }
        }
        System.out.println(Arrays.toString(resultado));
    }

}