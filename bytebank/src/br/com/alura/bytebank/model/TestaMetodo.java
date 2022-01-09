package br.com.alura.bytebank.model;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);

        conta.saca(20);
        System.out.println(conta.saldo);

        Conta conta2 = new Conta();
        conta2.deposita(1000);
        boolean sucessoTransferencia = conta2.transfere(300, conta);

        if(conta2.transfere(300, conta)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        };
        System.out.println(conta2.saldo);

        conta.titular = "Leandro Ikehara";
        System.out.println("Nome titular: " + conta.titular);
    }
}
