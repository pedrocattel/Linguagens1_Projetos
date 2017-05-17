
package exerciciointerfaces;

public class Gerente extends Funcionario implements IAutenticavel {
    
    public String psw;
    
    @Override
    public boolean autenticar(String senha) {
        return true;
    }
    
}