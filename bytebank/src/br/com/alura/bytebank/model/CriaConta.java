package br.com.alura.bytebank.model;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Primeira conta: " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("+100.0 = " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Segunda conta: " + segundaConta.saldo);
    }
}
