
package exercicio3;


public class Vendedor extends Funcionario {
    
    protected static double taxaComissao = 0.03;
    protected double totalVendas;
    
    public Vendedor (String n, String cpf, int reg, double salario) {
        super(n, cpf, reg, salario);
    }
    
}
