package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //perguntar n vendedores
        System.out.println("Quantos vendedores?");
        int nVend = scan.nextInt();
        //perguntar n gerentes
        System.out.println("Quantos Gerentes?");
        int nGer = scan.nextInt();

        int escolha = scan.nextInt();
        do {
            switch (escolha) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }  
        
        
        Concessionaria  cons = new Concessionaria(nVend, nGer);

        for (int i = 0; i < nVend; i++) { //pedir vendedores e gerentes
            System.out.println("Nome?");
            String nome = scan.next();
            System.out.println("Cpf?");
            String cpf = scan.next();
            System.out.println("Registro?");
            int reg = scan.nextInt();
            System.out.println("Salario?");
            double sal = scan.nextDouble();
            cons.novoVendedor(nome, cpf, reg, sal);
        }

        for (int i = 0; i < nGer; i++) { //pedir vendedores e gerentes
            System.out.println("Nome?");
            String nome = scan.next();
            System.out.println("Cpf?");
            String cpf = scan.next();
            System.out.println("Registro?");
            int reg = scan.nextInt();
            System.out.println("Salario?");
            double sal = scan.nextDouble();
            cons.novoGerente(nome, cpf, reg, sal);
        }
    }

}
