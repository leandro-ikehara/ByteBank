package br.com.alura.bytebank.herdado.conta.exception;

public class SaldoInsuficienteException extends Exception
{
    public SaldoInsuficienteException(String msg)
    {
        super(msg);
    }
}
