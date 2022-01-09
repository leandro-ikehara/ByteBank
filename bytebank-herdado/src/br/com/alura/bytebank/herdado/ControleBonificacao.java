package br.com.alura.bytebank.herdado;

import br.com.alura.bytebank.herdado.entidade.Funcionario;

public class ControleBonificacao
{
    private double soma;

    public void registra(Funcionario funcionario)
    {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    // Não é necessário criar um método para Funcionário
//    public void registra(Gerente gerente)
//    {
//        double bonificacao = gerente.getBonificacao();
//        this.soma = this.soma + bonificacao;
//    }

//    public void registra(EditorVideo editorVideo)
//    {
//        double bonificacao = editorVideo.getBonificacao();
//        this.soma = this.soma + bonificacao;
//    }

    public double getSoma() {
        return soma;
    }
}
