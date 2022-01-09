using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_ByteBank
{
    class Program
    {
        static void Main(string[] args) {
            ContaCorrente conta = new ContaCorrente();

            conta.titular = "Ana Paula";
            conta.saldo = 200; // valor sobrescreve o valor padrão

            Console.WriteLine(conta.titular);
            Console.WriteLine(conta.saldo);
        }
    }
}
