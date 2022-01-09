using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04_ByteBank
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ContaCorrente contaDoLeandro = new ContaCorrente();

            contaDoLeandro.titular = "Leandro";

            Console.WriteLine(contaDoLeandro.saldo);
            
            bool resultadoSaque = contaDoLeandro.Sacar(50);
            
            Console.WriteLine(contaDoLeandro.saldo);
            Console.WriteLine(resultadoSaque);
            Console.WriteLine(contaDoLeandro.saldo);

            contaDoLeandro.Depositar(500);
            Console.WriteLine(contaDoLeandro.saldo);

            ///// ----- criação da instância contaAnaPaula de ContaCorrente ----- /////
            ContaCorrente contaAnaPaula = new ContaCorrente();

            contaAnaPaula.titular = "Ana Paula";

            Console.WriteLine("Saldo do Leandro: " + contaDoLeandro.saldo);
            Console.WriteLine("Saldo da Ana Paula: " + contaAnaPaula.saldo);

            // Utilizando a função Transferir contaDoLeandro => contaAnaPaula
            contaDoLeandro.Transferir(250, contaAnaPaula);
            Console.WriteLine("Saldo do Leandro: " + contaDoLeandro.saldo);
            Console.WriteLine("Saldo da Ana Paula: " + contaAnaPaula.saldo); 

            // Confirmando a transferência dos valores
            bool resultadoTransferencia = contaDoLeandro.Transferir(200, contaAnaPaula);
            Console.WriteLine("Resultado transferência: " + resultadoTransferencia);

            // Realizando o caminho inverso da Transferência contaAnaPaula => contaDoLeandro
            contaAnaPaula.Transferir(50, contaDoLeandro);
            Console.WriteLine("Saldo do Leandro: " + contaDoLeandro.saldo);
            Console.WriteLine("Saldo da Ana Paula: " + contaAnaPaula.saldo);

            Console.ReadLine();
        }
    }
}
