package br.com.alura.bytebank.herdado.conta.entidade;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
//  String titular;
    private Cliente titular;
    private static int total = 0; // o atributo static é referente à classe e não ao objeto

    //Construtor:
    public Conta(){

    }

    public Conta (int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        System.out.println("Você abriu uma conta corrente: " + this.numero + " e agência: " + this.agencia);
    }

    public abstract void deposita(double valor); // método abstrato não possui implementação
//    {
//        this.saldo = this.saldo + valor;
//    }

    public boolean saca(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor))
        {
            destino.deposita(valor);
            return true;
        }
            return false;
    }

    public double getSaldo(){ // pegaSaldo
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if(numero <= 0){
            System.out.println("Não é permitido número da conta negativo");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Não é permitido número da agência negativo");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
