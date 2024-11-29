package org.example.G_generics;

import org.example.G_generics.service.PrintService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What kind of list? [s - String | i - Integer] ");

        String option = sc.next();

        System.out.println("How many valuew? ");
        int n = sc.nextInt();

        if(option.charAt(0) == 'i'){

            PrintService<Integer> integerPrintService = new PrintService<>();

            for (int i = 0; i < n; i++){
                Integer value = sc.nextInt();
                integerPrintService.addValue(value);
            }

            integerPrintService.print();
            System.out.println("First " + integerPrintService.first());

        } else {

            PrintService<String> stringPrintService = new PrintService<>();

            for (int i = 0; i < n; i++){
                String value = sc.next();
                stringPrintService.addValue(value);
            }

            stringPrintService.print();
            System.out.println("First " + stringPrintService.first());
        }

    sc.close();;

    }
}
