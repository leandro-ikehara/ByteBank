package br.com.alura.bytebank.composto;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta conta2 = new Conta();
        System.out.println(conta2.pegaSaldo());

        conta2.titular = new Cliente();
        System.out.println(conta2.titular);

        conta2.titular.nome = "Ana Paula";
        System.out.println(conta2.titular.nome);
    }
}
