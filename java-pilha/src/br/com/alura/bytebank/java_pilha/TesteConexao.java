package br.com.alura.bytebank.java_pilha;

import br.com.alura.bytebank.java_pilha.entidade.Conexao;


public class TesteConexao
{
    public static void main(String[] args)
    {
        Conexao conexao = null;
        try {
//            Conexao conexao = new Conexao();
            conexao = new Conexao();
            conexao.leDados();
//            conexao.fecha();
        }
        catch (IllegalStateException ex)
        {
            System.out.println("Erro de conexão");
//            conexao.fecha();
        }
        finally // o bloco finally é sempre executado mesmo que a conexão se feche
        {
            conexao.fecha();
        }
    }
}
