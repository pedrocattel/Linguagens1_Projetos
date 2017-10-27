/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizandojavav2;

import br.com.xavier.organizando.Cliente;

/**
 *
 * @author pedrocattel
 */
public class OrganizandoJavaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        br.com.xavier.organizando.Cliente eu = new br.com.xavier.organizando.Cliente();
        eu.setNome("Pedro");
        System.out.println(eu.retornaNome());
    }
    
}
