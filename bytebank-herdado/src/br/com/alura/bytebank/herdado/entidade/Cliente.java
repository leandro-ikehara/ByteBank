package br.com.alura.bytebank.herdado.entidade;

import br.com.alura.bytebank.herdado.interfaces.Autenticavel;

// implementação da interface Autenticavel
public class Cliente implements Autenticavel // troca-se "extends" para "implements" interface
{
    //private int senha;
    private AutenticacaoUtil autenticador;

    public Cliente()
    {
        this.autenticador = new AutenticacaoUtil();

    }

    @Override
    public void setSenha(int senha)
    {
        this.autenticador.setSenha(senha); // a chamada foi delegada para o AutenticacaoUtil
    }

    @Override
    public boolean autentica(int senha)
    {
//        if (this.senha == senha){
//            return true;
//        } else {
//            return false;
//        }
        return this.autenticador.autentica(senha); // a chamada também foi delegada para AutenticacaoUtil

    }
}
