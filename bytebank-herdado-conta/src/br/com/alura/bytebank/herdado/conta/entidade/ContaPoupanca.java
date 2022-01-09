package br.com.alura.bytebank.herdado.conta.entidade;

public class ContaPoupanca extends Conta
{
    public ContaPoupanca(int agencia, int numero)
    {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor; // o operador += é equivalente a saldo = saldo + valor

    }
}
