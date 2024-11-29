package org.example.E_enum.entities;

import org.example.E_enum.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private Double baseSalary;
    private WorkerLevel workerLevel;
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }
    public Worker(String name, Double baseSalary, WorkerLevel workerLevel, Departament departament) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.workerLevel = workerLevel;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract hourContract){
        contracts.add(hourContract);
    }

    public void removeContract(HourContract hourContract){
        contracts.remove(hourContract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts) {
            calendar.setTime(calendar.getTime());
            int calendarYear = calendar.get(Calendar.YEAR);
            int calendarMonth = calendar.get(Calendar.MONTH) + 1;

        }
        return sum;
    }
}
