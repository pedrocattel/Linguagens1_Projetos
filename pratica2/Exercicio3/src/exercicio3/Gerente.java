package exercicio3;


public class Gerente extends Funcionario {
    
    protected static double taxaComissao = 0.05;
    protected double totalVendas;
    
    public Gerente (String n, String cpf, int reg, double salario) {
        super(n, cpf, reg, salario);
    }
    
}
