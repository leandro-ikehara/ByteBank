package br.com.alura.bytebank.herdado.conta.entidade;

import br.com.alura.bytebank.herdado.conta.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel
{
    @Override
    public double getValorImposto() {
        return 42;
    }
}
