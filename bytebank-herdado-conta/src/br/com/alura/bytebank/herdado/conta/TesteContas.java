package br.com.alura.bytebank.herdado.conta;

import br.com.alura.bytebank.herdado.conta.entidade.ContaCorrente;
import br.com.alura.bytebank.herdado.conta.entidade.ContaPoupanca;

public class TesteContas
{
    public static void main(String[] args)
    {
        ContaCorrente cc = new ContaCorrente(826, 826123);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(8261, 826124);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("C/C: " + cc.getSaldo());
        System.out.println("Poupança: " + cp.getSaldo());

    }
}
