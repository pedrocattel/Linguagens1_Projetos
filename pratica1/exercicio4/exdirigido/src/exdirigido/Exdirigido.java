
package exdirigido;


public class Exdirigido {

    
    public static void main(String[] args) {
        Conta c1;
        c1 = new Conta();
        c1.saldo = 1000;
        c1.visualizarSaldo();
        c1.depositar(1000);
        c1.visualizarSaldo();
        c1.sacar(300);
        c1.visualizarSaldo();
             
        
    }
    
}
