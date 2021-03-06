package testeheranca;

public class GerenteDeVendas extends Vendedor {

//    private String nomeCompleto;
//    private String cpf;
//    private int registro;
//    private double salarioBase;
//    private static double taxaComissao = 0.03;
//    private double horaExtra;
//    private double totalVendas;
    private int vendedores;
    private String senha;

    public GerenteDeVendas(String n, String c, int reg, double salario, double hora) {
        super(n,c,reg,salario,hora);
    }
 
   public String getNome() {
        return this.nomeCompleto;
    }

    public void setNome(String nomeNovo) {
        this.nomeCompleto = nomeNovo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpfNovo) {
        this.cpf = cpfNovo;
    }

    public int getRegistro() {
        return this.registro;
    }

    public void setRegistro(int registroNovo) {
        this.registro = registroNovo;
    }

    public double getHoraExtra() {
        return this.horaExtra;
    }

    public void setHoraExtra(double horaNova) {
        this.horaExtra = horaNova;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioNovo) {
        this.salarioBase = salarioNovo;
    }

    public static double getTaxa() {
        return GerenteDeVendas.taxaComissao;
    }

    public static void setTaxa(double taxaNova) {
        GerenteDeVendas.taxaComissao = taxaNova;
    }

    public void setSenha(String senhaNova) {
        this.senha = senhaNova;
    }

    public double calcularComissao() {
        return this.totalVendas * GerenteDeVendas.taxaComissao;
    }

    public double calcularDecimoTerceiro() {
        return this.salarioBase;
    }

    public double calcularFerias() {
        return this.salarioBase + this.salarioBase / 3;
    }

    public double salarioDoMes() {
        return this.salarioBase + this.horaExtra + this.calcularComissao();
    }

    public void exibirResumo() {
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salário total: " + this.salarioDoMes());
        System.out.println("Comissão: " + this.calcularComissao());
        System.out.println("Férias: " + this.calcularFerias());
        System.out.println("13º: " + this.calcularDecimoTerceiro());
        System.out.println("Vendas: " + this.totalVendas);
    }

    public boolean contabilizarVenda(double venda) {
        if (venda > 0) {
            this.totalVendas = this.totalVendas + venda;
            return true;
        } else {
            return false;
        }
    }

    public void incrementarVendedor() {
        this.vendedores = this.vendedores + 1;
    }

    public void decrementarVendedor() {
        this.vendedores = this.vendedores - 1;
    }

    public boolean darAumento(Vendedor vend, double aumento, String senha){
         if(vend.getGerente().equals(this.getNome())){
             vend.setSalarioBase(vend.getSalarioBase() * (1 + aumento));
             return true;
            
         }
         else {
             return false;
            
         }
         
    }

}

