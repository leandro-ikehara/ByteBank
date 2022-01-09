package br.com.alura.bytebank.herdado.main;

import br.com.alura.bytebank.herdado.ControleBonificacao;
import br.com.alura.bytebank.herdado.entidade.EditorVideo;
import br.com.alura.bytebank.herdado.entidade.Gerente;

// Polimorfismo
public class TesteReferencias
{
    public static void main(String[] args)
    {
        Gerente gerente1 = new Gerente();
        //Funcionario gerente1 = new Gerente(); // compila, pois Gerente herda de Funcionario
        //Gerente gerente1 = new Funcionario(); // não compila, pois Funcionario não herda de Gerente

        gerente1.setNome("Marcos");
        gerente1.setSalario(5000);

        // Funcionario se tornou uma classe abstrata, portanto não pode ser instanciado
//      Funcionario funcionario1 = new Funcionario();
//      funcionario1.setSalario(2000);

        EditorVideo editorVideo1 = new EditorVideo();
        editorVideo1.setSalario(2500);

        // Registra diferentes tipos de Funcionario, através do mesmo método (ControleBonificacao)
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);
        //controle.registra(funcionario1);
        controle.registra(editorVideo1);

        System.out.println(controle.getSoma());
    }
}
