package br.com.alura.bytebank.herdado.entidade;

import br.com.alura.bytebank.herdado.interfaces.Autenticavel;

// Gerente HERDA de Funcionário
public class Gerente extends Funcionario implements Autenticavel
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
        // o 'super' significa que o atributo vem da classe-pai
        return super.getSalario();
        // o método 'salario' fica disponível devido ao modificador 'protected'
    }

    private AutenticacaoUtil autenticador;

    public Gerente()
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

//    public String getNome()
//    {
//        return nome;
//    }
//
//    public void setNome(String nome)
//    {
//        this.nome = nome;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf)
//    {
//        this.cpf = cpf;
//    }
//
//    public double getSalario()
//    {
//        return salario;
//    }
//
//    public void setSalario(double salario)
//    {
//        this.salario = salario;
//    }
}


