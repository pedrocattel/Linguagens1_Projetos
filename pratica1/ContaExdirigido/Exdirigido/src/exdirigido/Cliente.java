package exdirigido;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    int idade;

    void visualizarcliente() {
        System.out.println("Nome: "+ this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }

    public void mudarCPF(String cpf){
        if (validarCPF(cpf)){
            this.cpf = cpf;
        }
        else {
            System.out.println("Não foi possivel alterar o cpf");
            
        }
    }
    
    private boolean validarCPF(String cpf){
       return true; 
    }
    
    public String getNome(){
        return this.nome;
    }
    
     public String setNome(String nome){
        return this.nome;
    }
    
    public String getCPF (){
        return this.cpf;
    }
    
    public void setCPF (String cpf){
        this.cpf = cpf;
    }
    
    public String getSobrenome (){
        return this.sobrenome;
    }
    
    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }
    
}
