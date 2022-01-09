

namespace _07_ByteBank
{
    public class ContaCorrente
    {
                
        // public string titular;
        private Cliente _titular;

        public Cliente Titular
        {
            get;
            //{
            //    return _titular;
            //}
            set;
            //{
            //    _titular = value;
            //}
        }

        // a palavra static indica que a propriedade pertence à classe
        public static int TotalDeContasCriadas { get; private set; } // o set tornou-se privado, não podendo ser modificado externamente

        //public static int ObterTotalDeContasCriadas() // foi criado o método ObterTotalDeContasCriadas para acessar a propriedade TotalDeContasCriadas
        //{
        //    return TotalDeContasCriadas;
        //}

        public int Agencia { get; set; }
        public int Numero { get; set; }


        //public int agencia;
        //public int numero;
        
        private double _saldo = 100; // alteração para private para ser visível apenas na classe

        public double Saldo // as propriedades sempre começam com maiúsculo
        {
            get
            {
                return _saldo; // por convenção, o underline "_" define que é um campo privado e pertence somente àquela classe
            }
            set
            {
                if(value < 0)
                {
                    return ;
                }
                _saldo = value;

            }
        }

        // Construtores
        public ContaCorrente(int agencia, int numero)
        {
            Agencia = agencia;
            Numero = numero;

            ContaCorrente.TotalDeContasCriadas++; // TotalDeContasCriadas é static, portanto acessada pela classe

        }

        // Com os getters e setters, não é mais necessário GetSaldo e SetSaldo
        //        public void GetSaldo(double saldo) // o termo "get" substitui o termo "Obter"
        //        {
        //            if(saldo < 0)
        //            {
        //                return;
        //            } 
        //            this.saldo = saldo; // esse saldo faz referência ao argumento de DefinirSaldo
        //        }


        //       public double SetSaldo() // o termo "set" substitui o termo "Definir"
        //       {
        //           return saldo;
        //       }

        public bool Sacar(double valor) // quando há retorno, é chamado de "função"
        {
            if (_saldo < valor)
            {
                return false;
            }
            _saldo -= valor;
            return true;
        }
        public void Depositar(double valor) // quando não há retorno, é chamado de "método"
        {
            _saldo += valor;
        }

        public bool Transferir(double valor, ContaCorrente contaDestino)
        {
            if (_saldo < valor)
            {
                return false;
            }
            _saldo -= valor;
            contaDestino.Depositar(valor);
            return true;
        }
    }
}
