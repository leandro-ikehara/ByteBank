package br.com.alura.bytebank.java_pilha;

public class Fluxo {

    public static void main(String[] args)
    {
        System.out.println("Ini do main");

        // Tratamento de erro "try/catch"
        try
        {
            metodo1();
        }
        catch (ArithmeticException | NullPointerException ex)
        {
            String msg = ex.getMessage();
            System.out.println("Erro: " + msg);
            ex.printStackTrace();
        }
//        catch (NullPointerException ex)
//        {
//            String msg = ex.getMessage();
//            System.out.println("NullPointerException " + msg);
//            ex.printStackTrace();
//        }
        System.out.println("Fim do main");
    }

    private static void metodo1()
    {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2()
    {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);
//            Conta c = null;
//            c.deposita();

            // Tratamento de erro "try/catch"
//            try
//            {
                int a = i / 0;
//            }
//            catch (ArithmeticException ex)
//            {
//                System.out.println("ArithmeticException");
//            }

        }
        System.out.println("Fim do metodo2");
    }
}
