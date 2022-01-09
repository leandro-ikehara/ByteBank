package br.com.alura.bytebank.herdado.main;

import br.com.alura.bytebank.herdado.entidade.Cliente;
import br.com.alura.bytebank.herdado.entidade.EditorVideo;
import br.com.alura.bytebank.herdado.entidade.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args)
    {
        Cliente cliente = new Cliente();


        Funcionario leandro = new EditorVideo();

        leandro.setNome("Leandro Ikehara");
        leandro.setCpf("302.343.643-20");
        leandro.setSalario(2900.00);

        System.out.println(leandro.getNome());

        System.out.println(leandro.getBonificacao());
    }
}
