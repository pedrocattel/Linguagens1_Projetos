package exdirigido;

public class Conta {

    private int numero;
    private double saldo;
    private Cliente titular;

    public void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor < this.saldo) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Conta c1, double valor) {
        if (this.sacar(valor)) {
            c1.depositar(valor);
            System.out.println("Ok");
            return true;
        } else {
            System.out.println("Não rolou a tranferencia");
            return false;
        }
    }
    
    public Conta (int saldo, int numero, Cliente titular, String cpf, String nome, String sobrenome){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = new Cliente();
        this.titular.cpf = cpf;
        this.titular.nome = nome;
        this.titular.sobrenome = sobrenome;        
    }

}
