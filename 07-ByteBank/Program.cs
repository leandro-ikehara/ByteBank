using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07_ByteBank
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(ContaCorrente.TotalDeContasCriadas + " conta criada \n------");

            ContaCorrente conta = new ContaCorrente(865, 865123);

            Console.WriteLine(ContaCorrente.TotalDeContasCriadas + "ª conta criada:");

            //conta.Agencia = 865;
            //conta.Numero = 865123;

            //conta.TotalDeContasCriadas++;

            Console.WriteLine("Agência: " + conta.Agencia + "\nNúmero: " + conta.Numero + "\n------");

            ContaCorrente contaAnaPaula = new ContaCorrente(865, 865456);
            Console.WriteLine(ContaCorrente.TotalDeContasCriadas + "ª conta criada");
            Console.WriteLine("Agência: " + contaAnaPaula.Agencia + "\nNúmero: " + contaAnaPaula.Numero + "\n------");

        }
    }
}
