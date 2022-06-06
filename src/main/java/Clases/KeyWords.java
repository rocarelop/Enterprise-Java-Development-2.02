package Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyWords {

    public boolean keyWordsCheck(String frase){
        List<String> javaKeyWords = new ArrayList<>(Arrays.asList(new String[]{"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while"}));

        String[] palabras = frase.split(" ");
        boolean aviso= false;

        for(String palabra : palabras){
            if(javaKeyWords.contains(palabra)){
                aviso = true;
                break;
            }
        }


        return aviso;

    }
}
