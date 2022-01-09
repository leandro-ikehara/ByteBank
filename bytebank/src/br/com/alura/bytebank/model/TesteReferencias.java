package br.com.alura.bytebank.model;
// Neste exemplo, as variáveis primeiraConta e segundaConta referenciam para o mesmo objeto

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        }

    }
}
