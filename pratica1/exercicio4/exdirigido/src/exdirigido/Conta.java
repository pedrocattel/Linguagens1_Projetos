package exdirigido;

public class Conta {

    int numero;
    double saldo;
    Cliente titular;

    void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    boolean sacar(double valor) {
        if (valor < this.saldo) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    boolean transferir(Conta c1, double valor) {
        if (this.sacar(valor)) {
            c1.depositar(valor);
            System.out.println("Ok");
            return true;
        } else {
            System.out.println("Não rolou a tranferencia");
            return false;
        }
    }
}
