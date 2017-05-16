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
public class Gerente extends Funcionario implements IAutenticavel {
    
    @Override
    public boolean autenticar(double senha) {
        return true;
    }
    
}