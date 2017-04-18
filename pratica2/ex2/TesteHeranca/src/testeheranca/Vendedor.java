
package testeheranca;

public class Vendedor {

    protected String nomeCompleto;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    protected static double taxaComissao = 0.03;
    protected double horaExtra;
    protected double totalVendas;
    protected GerenteDeVendas gerente;
    
    public Vendedor (String n, String c, int reg, double salario, double hora) {
        this.setNome(n);
        this.setCpf(c);
        this.setRegistro(reg);
        this.setSalarioBase(salario);
        this.setHoraExtra(hora);
        ger.incrementarVendedor();
    }
    
    public String getNome () {
        return this.nomeCompleto;
    }
    
    public void setNome (String nomeNovo) {
        this.nomeCompleto = nomeNovo;
    }
    
    public String getCpf () {
        return this.cpf;
    }
    
    public void setCpf (String cpfNovo) {
        this.cpf = cpfNovo;
    }
    
    public int getRegistro () {
        return this.registro;
    }
    
    public void setRegistro (int registroNovo) {
        this.registro = registroNovo;
    }
    
    public double getHoraExtra () {
        return this.horaExtra;
    }
    
    public void setHoraExtra (double horaNova) {
        this.horaExtra = horaNova;
    }
    
    public double getSalarioBase () {
        return this.salarioBase;
    }
    
    public void setSalarioBase (double salarioNovo) {
        this.salarioBase = salarioNovo;
    }
    
    public static double getTaxa () {
        return Vendedor.taxaComissao;
    }
    
    public static void setTaxa (double taxaNova) {
        Vendedor.taxaComissao = taxaNova;
    }
    
    public String getGerente () {
        return this.gerente.getNome();
    }
    
    public void setGerente (GerenteDeVendas gerenteNovo) {
        this.gerente = gerenteNovo;
    }
    
    public double calcularComissao () {
        return this.totalVendas * Vendedor.taxaComissao;
    }
    
    public double calcularDecimoTerceiro () {
        return this.salarioBase;
    }
    
    public double calcularFerias () {
        return this.salarioBase + this.salarioBase/3;
    }
    
    public double salarioDoMes () {
        return this.salarioBase + this.horaExtra + this.calcularComissao();
    }
    
    public void exibirResumo () {
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salário total: " + this.salarioDoMes());
        System.out.println("Comissão: " + this.calcularComissao());
        System.out.println("Férias: " + this.calcularFerias());
        System.out.println("13º: " + this.calcularDecimoTerceiro());
        System.out.println("Vendas: " + this.totalVendas);
    }
    
    public boolean contabilizarVenda (double venda) {
        if (venda > 0) {
            this.totalVendas = this.totalVendas + venda;
            return true;
        } else {
            return false;
        }
    }
    

}