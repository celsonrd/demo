package org.example.D_list;

import org.example.A_contaBancaria.ContaBancaria;
import org.example.B_product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

//        list.add("Celson");
//        list.add("da");
//        list.add("Silva");
//        list.add("Rodrigues");
//        list.add("Nicole");
//        list.add("Portela");
//        list.add("Rodrigues");
//
//        list.add(2, "Jose");
//
//
//        for (String item : list) {
//            System.out.println(item);
//        }
//
//        System.out.println("------------------------------");
//
////        list.removeIf(x -> x.substring(x.length() -3) == 's');
//
//        String teste = "ola mundo";
//
//        System.out.println(teste.substring(teste.length() -2));
//
//        for (String item : list) {
//            System.out.println(item);
//        }
//        System.out.println("------------------------------");
//
//        System.out.println(list);
//        System.out.println("------------------------------");
//
//
//        List<String> result = list
//                .stream()
//                .filter(x -> x.charAt(0) == 'd')
//                .collect(Collectors.toList());
//
//        System.out.println("------------------------------");
//
//
//        System.out.println(result);

        System.out.println("How many employees will be registered?");

        List<Employer> employers = new ArrayList<>();

        int quantidade = sc.nextInt();

        for(int i = 1; i <= quantidade; i++){
            System.out.printf("Employee #%d:\n", i);
            System.out.print("Enter employee ID: ");
            Integer id = sc.nextInt();
            System.out.print("Enter employee name: ");
            String name = sc.next();
            sc.next();
            System.out.print("Enter employee salary: ");
            Double salary = sc.nextDouble();
            employers.add(new Employer(id, name, salary));

        }

        System.out.println("List of employees: ");

        for (Employer employer : employers) {
            System.out.println(employer.id + ", " + employer.name + ", " + employer.salary);
        }

        System.out.print("Enter the employee id that will have salary increase: ");

        Integer id = sc.nextInt();

        boolean existe = false;

        for (int i = 0; i < quantidade; i++) {
            if(employers.get(i).getId() == id){
                System.out.print("Enter the percentage: ");

                double percent = sc.nextDouble();

                employers.get(i).increaseSalary(percent);

                existe = true;

            }

        }

        if(existe == false){
            System.out.println("The id does not exists");
        }

        for (Employer employer : employers) {
            System.out.println(employer.id + ", " + employer.name + ", " + employer.salary);
        }


        sc.close();
    }
}




