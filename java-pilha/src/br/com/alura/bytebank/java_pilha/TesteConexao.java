package br.com.alura.bytebank.java_pilha;

import br.com.alura.bytebank.java_pilha.entidade.Conexao;


public class TesteConexao
{
    public static void main(String[] args)
    {
        try {
            Conexao conexao = new Conexao();
            conexao.leDados();
            conexao.fecha();
        }
        catch (IllegalStateException ex)
        {
            System.out.println("Erro de conexão");
        }
    }
}
