package br.com.alura.bytebank.java_pilha;

import br.com.alura.bytebank.java_pilha.exception.MeuErro;

public class TestaContaComErroChecked
{
    public static void main(String[] args)
    {
        Conta c = new Conta();

        try
        {
            c.deposita();
        }
        catch (MeuErro me)
        {
            System.out.println("Tratamento...");
        }
    }
}
