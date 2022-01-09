package br.com.alura.bytebank.herdado.conta;

import br.com.alura.bytebank.herdado.conta.entidade.ContaCorrente;
import br.com.alura.bytebank.herdado.conta.entidade.SeguroDeVida;

public class TesteTributaveis
{
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 222345);
        cc.deposita(100.0);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(sv);

        System.out.println(calc.getTotalImposto());

    }
}
