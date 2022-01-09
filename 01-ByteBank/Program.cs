using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_ByteBank
{
    class Program
    {
        static void Main(string[] args){
//            ContaCorrente contaDaAnaPaula = new ContaCorrente();

//            contaDaAnaPaula.titular = "Ana Paula";
//            contaDaAnaPaula.agencia = 863;
//            contaDaAnaPaula.numero = 8631234;
//            contaDaAnaPaula.saldo = 100;

//            Console.WriteLine("Titular: " + contaDaAnaPaula.titular);
//            Console.WriteLine("Agência: " + contaDaAnaPaula.agencia);
//            Console.WriteLine("C/C: " + contaDaAnaPaula.numero);
//            Console.WriteLine("Saldo: R$ " + contaDaAnaPaula.saldo);

            ContaCorrente primeiraContaCorrente = new ContaCorrente();

            primeiraContaCorrente.saldo = 200;
            Console.WriteLine(primeiraContaCorrente.saldo);

            primeiraContaCorrente.saldo += 100;
            Console.WriteLine(primeiraContaCorrente.saldo);

            Console.ReadLine();

            /////////
            ContaCorrente segundaContaCorrente = new ContaCorrente();
            segundaContaCorrente.saldo = 50;

            Console.WriteLine("A primeira conta tem R$ " + primeiraContaCorrente.saldo);
            Console.WriteLine("A segunda conta tem R$ " + segundaContaCorrente.saldo);

            Console.ReadLine();

        }
    }
}
