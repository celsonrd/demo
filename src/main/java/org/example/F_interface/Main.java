package org.example.F_interface;

import org.example.F_interface.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();

    String path = "c:\\temp\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

        String employeeCSV = br.readLine();

        while (employeeCSV != null){
            String[] field = employeeCSV.split(",");
            list.add(new Employee(field[0], Double.parseDouble(field[1])));
            employeeCSV = br.readLine();
        }

        Collections.sort(list);

        for (Employee employee : list){
            System.out.println(employee.getName() + " , " + employee.getSalary());
        }

    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }

}
