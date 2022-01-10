package br.com.alura.bytebank.herdado.conta;

import br.com.alura.bytebank.herdado.conta.entidade.Conta;
import br.com.alura.bytebank.herdado.conta.entidade.ContaCorrente;

public class TesteSaca
{
    public static void main(String[] args)
    {
        Conta conta = new ContaCorrente(234, 234654);

        conta.deposita(200);
        conta.saca(195);

        System.out.println(conta.getSaldo());
    }
}
