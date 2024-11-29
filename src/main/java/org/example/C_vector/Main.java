package org.example.C_vector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int tamanho = sc.nextInt();

        int vector[] = new int[tamanho];
        double media = 0;

        for (int i = 0; i < tamanho; i++){
            System.out.printf("digite o valor para a posição %d do vetor: ", i);
            vector[i] = sc.nextInt();

            media += sc.nextInt();

        }

        System.out.println("a media é " + media/tamanho);
    }
}
