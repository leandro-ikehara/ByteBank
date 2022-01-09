package br.com.alura.bytebank.herdado.entidade;

public abstract class Funcionario // classe abstrata não pode ser instanciada
{
    private String nome;
    private String cpf;
    private double salario;
//    protected double salario; // o modificador protected permite que os filhos da classe podem acessar ao atributo

    public abstract double getBonificacao(); // esse método se tornou abstrato e não possui implementação
//    {
//        return this.salario * 0.05;
//    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}


