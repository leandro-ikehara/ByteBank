package br.com.alura.bytebank.herdado.conta;

import br.com.alura.bytebank.herdado.conta.interfaces.Tributavel;

public class CalculadorDeImposto
{
    private double totalImposto;

    public void registra(Tributavel tributavel)
    {
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto()
    {
        return totalImposto;
    }
}
