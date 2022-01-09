using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03_ByteBnak
{
    class Program
    {
        static void Main(string[] args)
        {
            ContaCorrente contaDaAnaPaula = new ContaCorrente();

            contaDaAnaPaula.titular = "Ana Paula";
            contaDaAnaPaula.agencia = 863;
            contaDaAnaPaula.numero = 8631234;

            ContaCorrente contaDaAnaPaulaOliveira = new ContaCorrente();

            contaDaAnaPaulaOliveira.titular = "Ana Paula Oliveira";
            contaDaAnaPaulaOliveira.agencia = 863;
            contaDaAnaPaulaOliveira.numero = 8631234;

            Console.WriteLine("Igualdade de tipo de referência: " +
                (contaDaAnaPaula == contaDaAnaPaulaOliveira)); // mesmo com dados iguais, os objetos são diferentes
            // retorno False

            int idade = 27;
            int outraIdade = 27;

            Console.WriteLine("Igualdade de tipo de valor: " + 
                (idade == outraIdade)); // variáveis com nomes diferentes com o mesmo dado são iguais
            // returno True

            contaDaAnaPaula = contaDaAnaPaulaOliveira;
            Console.WriteLine("Variáveis que setam para o mesmo objeto: " +
                (contaDaAnaPaula == contaDaAnaPaulaOliveira)); //ambas as variáveis guardam referência para o mesmo objeto
            // retorno True

        }
    }
}
