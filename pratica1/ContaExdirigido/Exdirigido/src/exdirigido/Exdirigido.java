package exdirigido;

public class Exdirigido {

    public static void main(String[] args) {
        Conta c1 = new Conta("39753572824","Pedro","Cattel");
        c1.titular.visualizarcliente();
        

        
        c1.visualizarSaldo();
        c1.depositar(1000);
        c1.visualizarSaldo();
        c1.sacar(300);
        c1.visualizarSaldo();
        //c1.transferir(c2, 1000);
       //c2.visualizarSaldo();
        

    }

}
