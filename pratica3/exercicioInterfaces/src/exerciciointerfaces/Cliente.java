
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerfaces;


public class Cliente implements IAutenticavel, IImprimivel {
    
    private String psw;
    private String cpf;
    private String nome;
    
    
    public boolean alterarSenha (String senhaNova, String senhaAntiga){
        
        boolean retorno = false;
        
        if(senhaAntiga.equals(this.psw)){
            this.psw = senhaNova;
           return true;
        }
        return retorno;
    }
    
    @Override
    public boolean autenticar(String senha) {
        return true;
    }
    
    @Override
    public void exibirResumo() {
        System.out.println("Resumo aqui");
    }
    
    @Override
    public void imprimirResumo() {
        System.out.println("Resumo impresso");
    }
    
}