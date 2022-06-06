package Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {
    private int [] array;

    public int[] odds(int num){
        List<Integer> oddlist = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                oddlist.add(i);
            }
        }
        this.array = oddlist.stream().mapToInt(i->i).toArray();
        return this.array;
    }


}
