using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_ByteBank
{
    class Program
    {
        static void Main(string[] args)
        {
            //Cliente anapaula = new Cliente();

            //anapaula.nome = "Ana Paula";
            //anapaula.profissao = "Analista Salesforce";
            //anapaula.cpf = "306.203.532-12";

            ContaCorrente conta = new ContaCorrente();

            //conta.titular = anapaula;
            conta.titular = new Cliente(); // conta.titular faz referência à Cliente da mesma forma
            conta.titular.nome = "Ana Paula";
            conta.titular.profissao = "Analista Salesforce";
            conta.titular.cpf = "306.203.532-12";

            conta.saldo = 500;
            conta.agencia = 563;
            conta.numero = 563123;

            if (conta.titular == null)
            {
                Console.WriteLine("Ops, campo nulo");
            }

            // os exemplos abaixo fazem referência ao mesmo objeto
            //Console.WriteLine(anapaula.nome);
            Console.WriteLine(conta.titular.nome);
            Console.WriteLine(conta.titular.profissao);
            Console.WriteLine(conta.titular.cpf);

            Console.ReadLine();
        }
    }
}
