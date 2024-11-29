package org.example.A_contaBancaria;

public class ContaBancaria {

    private int number;
    private String name;
    private double saldo;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public ContaBancaria(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account data:\n" +
                "Account " + number +
                " Holder: " + name +
                " Balance: " + saldo;
    }
}
