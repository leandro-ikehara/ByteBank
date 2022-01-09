package br.com.alura.bytebank.composto;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente leandro = new Cliente();
        leandro.nome = "Leandro Ikehara";
        leandro.cpf = "303.303.303-11";
        leandro.profissao = "Desenvolvedor";

        Conta conta = new Conta();
        conta.deposita(100);

        // associa o cliente leandro a conta conta
        conta.titular = leandro;

        System.out.println(conta.titular.nome);
        System.out.println(conta.titular); // faz referência ao mesmo endereço de memória que abaixo
        System.out.println(leandro); // 'leandro' é o equivalente ao 'conta.titular' acima
    }
}
