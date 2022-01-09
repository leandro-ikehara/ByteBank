package br.com.alura.bytebank.model;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor){
        saldo = saldo + valor;
    }

    public boolean saca(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }

    }

}
