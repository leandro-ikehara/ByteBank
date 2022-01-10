package br.com.alura.bytebank.herdado.conta;

import br.com.alura.bytebank.herdado.conta.entidade.Conta;
import br.com.alura.bytebank.herdado.conta.entidade.ContaCorrente;
import br.com.alura.bytebank.herdado.conta.exception.SaldoInsuficienteException;

public class TesteSaca
{
    public static void main(String[] args)
    {
        Conta conta = new ContaCorrente(234, 234654);
        conta.deposita(200);

        try {
            conta.saca(210);
        }
        catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
