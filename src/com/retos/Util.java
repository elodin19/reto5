package com.retos;

import java.util.ArrayList;

public class Util {

    public static ArrayList<Integer> stringToArray(String strScanner) throws Exception {

        char []charNumbersAndCommas = strScanner.toCharArray();
        ArrayList<Character> listNumbersAndCommas = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        String accumulate = "";

        //Testa si el primer y último char no es '[' y ']'
        if (charNumbersAndCommas[0] != '[' || charNumbersAndCommas[charNumbersAndCommas.length - 1] != ']') {
            throw new Exception();
        } else {
            // Si son, elimina apenas al primer
            for (int i = 0; i < charNumbersAndCommas.length; i++){
                if ( i != 0) {
                    listNumbersAndCommas.add(charNumbersAndCommas[i]);
                }
            }
        }

        // Acumula los "chars" hasta que detecta ',' o ']'
        // Si el usuario pone ']' dentro del array también dará error pues el parse no vá funcionar
        // Si los chars no son números, ni ',', ni ']' se creará una excepción
        for (int i = 0; i < listNumbersAndCommas.size(); i++){

            if ( listNumbersAndCommas.get(i) == '0' ||
                    listNumbersAndCommas.get(i) == '1' ||
                    listNumbersAndCommas.get(i) == '2' ||
                    listNumbersAndCommas.get(i) == '3' ||
                    listNumbersAndCommas.get(i) == '4' ||
                    listNumbersAndCommas.get(i) == '5' ||
                    listNumbersAndCommas.get(i) == '6' ||
                    listNumbersAndCommas.get(i) == '7' ||
                    listNumbersAndCommas.get(i) == '8' ||
                    listNumbersAndCommas.get(i) == '9'
            ){
                accumulate += listNumbersAndCommas.get(i);
            } else if (listNumbersAndCommas.get(i) == ',' || listNumbersAndCommas.get(i) == ']'){
                result.add(Integer.parseInt(accumulate));
                accumulate = "";
            } else {
                throw new Exception();
            }
        }

        return result;
    }

}
