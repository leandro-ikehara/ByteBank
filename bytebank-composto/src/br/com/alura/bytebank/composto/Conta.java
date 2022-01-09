package br.com.alura.bytebank.composto;

public class Conta {
    private double saldo;
    int agencia;
    int numero;
//  String titular;
    Cliente titular;

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
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

    public double pegaSaldo(){ // getSaldo
        return this.saldo;
    }

}
