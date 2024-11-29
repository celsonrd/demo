package org.example.A_contaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int conta = sc.nextInt();

        System.out.print("Enter account number: ");
        String nome = sc.next();

        ContaBancaria contaBancaria = new ContaBancaria(conta, nome);

        System.out.print("Is there na initial deposit (y/n)? ");
        String depositoInicial = sc.next();

        if (depositoInicial.equals("y")){
            System.out.print("Enter initial deposito value: ");

            contaBancaria.depositar(sc.nextDouble());
            System.out.println(contaBancaria);

        } else {
            System.out.println(contaBancaria);
        }

        sc.close();
    }
}
