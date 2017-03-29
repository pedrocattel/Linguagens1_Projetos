
package testeheranca;

public class Vendedor {

    private String nome;
    private String cpf;
    private String sobrenome;
    private int salarioBase;
    private int registro;
    private int horaExtra;
    private double totalVendas;
    private int taxaComissao; //static
    private Gerente gerente;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(int salario) {
        this.salarioBase = salario;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void setHoraExtra(int horaextra) {
        this.horaExtra = horaextra;
    }

    public void settaxaComissao(int taxacomissao) {
        this.taxaComissao = taxacomissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getSalarioBase() {
        return this.salarioBase;
    }

    public int getRegistro() {
        return this.registro;
    }

    public int getHoraExtra() {
        return this.horaExtra;
    }

    public int getTaxaComissao() {
        return this.taxaComissao;
    }

    public int decTer() {
        return this.salarioBase;
    }

    public double comissao(double totalVendas) {
        return totalVendas * 0.03;
    }

    public int calcFerias(int salarioBase) {
        this.salarioBase = (this.salarioBase * (1/3) + this.salarioBase);
        return this.salarioBase;
    }

    public int salarioDoMes(int salarioBase, int horasExtras, int comissao) {
        return ( this.salarioBase + horasExtras + comissao);
    }

    public boolean contabilizarVenda(double venda) {
        if (venda > 0) {
            this.totalVendas = this.totalVendas + venda;
            return true;
        } else {
            return false;
        }
    }
    
    public void vendedor (String nome, String cpf, String sobrenome, int registro, int salario, Gerente chefe){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setCpf(cpf);
        this.setSalario(salario);
        this.setRegistro(registro);
        this.gerente = chefe;
        
    }
    
}
