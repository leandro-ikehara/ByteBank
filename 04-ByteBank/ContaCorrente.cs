
public class ContaCorrente {
    public string titular;
    public int agencia;
    public int numero;
    public double saldo = 100;

    public bool Sacar(double valor) // quando há retorno, é chamado de "função"
    {
        if(this.saldo < valor)
        {
            return false;
        } 
        this.saldo -= valor;
        return true;
    }
    public void Depositar(double valor) // quando não há retorno, é chamado de "método"
    {
        this.saldo += valor;
    }

    public bool Transferir(double valor, ContaCorrente contaDestino)
    {
        if(this.saldo < valor)
        {
            return false;
        } 
        this.saldo -= valor;
        contaDestino.Depositar(valor);
        return true;
    }
}