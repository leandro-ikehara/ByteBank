package br.com.alura.bytebank.encapsulado;

public class TestaGetSet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente leandro = new Cliente();
        //conta.titular = leandro; --> não compila, pois o atributo é privado
        leandro.setNome("Leandro Ikehara");

        conta.setTitular(leandro);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Desenvolvedor");
        // o mesmo resultado acima, mas em duas linhas:
        Cliente titularConta = conta.getTitular();
        titularConta.setProfissao("Desenvolvedor");

        System.out.println(titularConta);
        System.out.println(leandro);
        System.out.println(conta.getTitular());
    }

}
