package br.com.alura.bytebank.herdado.conta.exception;

public class SaldoInsuficienteException extends RuntimeException
{
    public SaldoInsuficienteException(String msg)
    {
        super(msg);
    }
}
