package banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Fiofor");
        f1.setSalario(100);
        f1.bonifica(50);
        f1.mostra();
        //System.out.println("salario atual: " + f1.getSalario());

    }
}
