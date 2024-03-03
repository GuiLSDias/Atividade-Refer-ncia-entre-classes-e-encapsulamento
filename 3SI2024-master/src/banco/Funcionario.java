package banco;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String rg;
    private boolean ativo;

    public Funcionario(){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntradaBanco = dataEntradaBanco;
        this.rg = rg;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void bonifica(double aumento){
        this.salario += aumento;
    }
    public void demite(){
        this.ativo = false;
    }
    void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salario: "+this.salario);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Data: "+this.dataEntradaBanco);
        System.out.println("RG: "+this.rg);
        System.out.println("Ativo: "+this.ativo);
    }
}
