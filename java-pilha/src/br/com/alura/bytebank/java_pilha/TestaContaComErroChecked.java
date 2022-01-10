package br.com.alura.bytebank.java_pilha;

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
