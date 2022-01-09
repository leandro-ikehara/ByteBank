package br.com.alura.bytebank.herdado;

import br.com.alura.bytebank.herdado.interfaces.Autenticavel;

public class SistemaInterno
{
    private int senha = 2222;

    public void autentica(Autenticavel autenticavel)
    {
        boolean autenticou = autenticavel.autentica(senha);
        if (autenticou)
        {
            System.out.println("Acesso liberado");
        }
        else
        {
            System.out.println("Acesso negado!");
        }
    }

}
