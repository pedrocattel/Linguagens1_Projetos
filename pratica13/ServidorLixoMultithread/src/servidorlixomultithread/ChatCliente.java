
package servidorlixomultithread;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;



public class ChatCliente {
    
    Socket Cliente;
    
    try{
        Socket cliente = new Socket (serverAddress, 9000);


        try{
            Scanner entradaRede = new Scanner (cliente.getInputStream());
            Scanner teclado = new Scanner (System.in);
            PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
        }
}
    
}
