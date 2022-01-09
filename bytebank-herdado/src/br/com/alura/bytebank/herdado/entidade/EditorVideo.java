package br.com.alura.bytebank.herdado.entidade;

// Gerente HERDA de Funcionário
public class EditorVideo extends Funcionario
{
    public double getBonificacao()
    {
        // o 'super' significa que o atributo vem da classe-pai
        return 150;
        // o método 'salario' fica disponível devido ao modificador 'protected'
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


