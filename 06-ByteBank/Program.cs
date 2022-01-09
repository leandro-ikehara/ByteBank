using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06_ByteBank
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ContaCorrente conta = new ContaCorrente();
            Cliente cliente = new Cliente();

            cliente.Nome = "Leandro";
            cliente.CPF = "503.235.352-11";
            cliente.Profissao = "Desenvolvedor";

            conta.Saldo = -10; // o termo "Definir" vira "Set"
            conta.Titular = cliente;

            Console.WriteLine(conta.Titular.Nome);
            Console.WriteLine(conta.Saldo); // o termo "Obter" vira "Get"

            Console.ReadLine();
        }
    }
}
