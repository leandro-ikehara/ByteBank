package br.com.alura.bytebank.herdado.interfaces;

// a classe Autenticavel foi transformada em interface, que é um "contrato" abstrato
// a ser implementado pela classe.
public abstract interface Autenticavel // troca-se "class" por "interface"
{
    // private int senha; // uma interface não pode ter nada concreto, somente abstrato

    public abstract void setSenha(int senha);

//    {
//        this.senha = senha; // uma interface também não possui implementação
//    }

    public abstract boolean autentica(int senha);
//    {
//        if(this.senha == senha)  // interface não possui implementação
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }

}
