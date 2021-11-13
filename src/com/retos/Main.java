package com.retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String strScanner;
        ArrayList<Integer> result = new ArrayList<>();

        do {
            System.out.println("\nDigite un array de numeros -> ejemplo: [1,2,3,4,5] ");
            strScanner = scanner.nextLine();

            try {
                result = Util.stringToArray(strScanner);
                System.out.println("El resultado es: " + result);
            } catch (Exception e){
                System.out.println("Formato incorrecto");
            }

        } while (result.isEmpty());
    }
}
