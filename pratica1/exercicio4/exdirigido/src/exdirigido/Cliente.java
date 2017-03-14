package exdirigido;

public class Cliente {

    String nome;
    String sobrenome;
    String cpf;

    void visualizarcliente() {
        System.out.println("Nome: "+ this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }

}
