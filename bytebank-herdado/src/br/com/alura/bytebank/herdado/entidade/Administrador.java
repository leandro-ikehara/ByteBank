package br.com.alura.bytebank.herdado.entidade;

import br.com.alura.bytebank.herdado.interfaces.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel
{
//    private int senha;
//
//    public void setSenha(int senha)
//    {
//        this.senha = senha;
//    }
//
//    public boolean autentica(int senha)
//    {
//        if(this.senha == senha)
//        {
//            return true;
//        } else
//        {
//            return false;
//        }
//    }

    @Override
    public double getBonificacao()
    {
        return 50;
    }

    private AutenticacaoUtil autenticador;

    public Administrador()
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
        return this.autenticador.autentica(senha); // a chamada também foi delegada para AutenticacaoUtil
    }
}
