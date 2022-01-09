package br.com.alura.bytebank.encapsulado;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(50, 330);

        // a conta está inconsistente
        //conta.setAgencia(-50);
        //conta.setNumero(-330);

        conta.setAgencia(123123);

        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2122, 15466);

        System.out.println("Total de contas: " + Conta.getTotal());

    }
}
