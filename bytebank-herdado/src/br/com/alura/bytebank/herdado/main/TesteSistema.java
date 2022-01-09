package br.com.alura.bytebank.herdado.main;

import br.com.alura.bytebank.herdado.SistemaInterno;
import br.com.alura.bytebank.herdado.entidade.*;

public class TesteSistema
{
    public static void main(String[] args)
    {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(administrador);
    }
}
