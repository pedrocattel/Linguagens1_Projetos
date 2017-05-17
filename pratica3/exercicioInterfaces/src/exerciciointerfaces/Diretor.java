/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerfaces;


public class Diretor extends Funcionario implements IAutenticavel {
    
    private String psw;
    
    public Diretor(String nome, int registro, double salario, String senha){
        this.setNome(nome);
        this.setRegistro(registro);
        this.setSalarioBase(salario);
        this.psw = senha;
    }
    
    @Override
    public boolean autenticar(String senha) {
       return this.psw.equals(senha);
    }
    
    public boolean alterarSenha (String senhaNova, String senhaAntiga){
        
        boolean retorno = false;
        
        if(senhaAntiga.equals(this.psw)){
            this.psw = senhaNova;
           return true;
        }
        return retorno;
    }
    
    public boolean darAumento(Funcionario F, String senha, double valor){
        
        boolean retorno = false;
        
        if (this.autenticar(senha)){
            F.setSalarioBase(F.getSalarioBase() + valor);
           retorno =  true;
        }
        return retorno;
    }
    
}