/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerfaces;

/**
 *
 * @author pedrocattel
 */
public class Secretaria extends Funcionario implements IExibicao {
    
    public boolean antederTelefone(boolean ocupado){
        return !ocupado;
        
    }
    
    @Override
    public void exibirResumo() {
        System.out.println("Resumo aqui");
    }
    
}
