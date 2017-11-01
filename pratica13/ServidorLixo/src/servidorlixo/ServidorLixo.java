
package servidorlixo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServidorLixo {

    public static void main(String[] args) throws IOException {
        try{
            ServerSocket servidor = new ServerSocket(3667);
            System.out.println("Servidor ouvindo porta 3667");
            while(true){
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                out.println("Olá, Bem vindo: Seu ip é: " + cliente.getInetAddress().getHostAddress());
                Scanner in = new Scanner(cliente.getInputStream());
                //Scanner scan = new Scanner(System.in);
                //scan.nextLine();
                String s = in.nextLine();
                System.out.println(s);
            }
        }
        catch(IOException e){
            
        }
    }
    
}
