package casa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void fazAniversario(){
        idade++;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme");
        pessoa.setIdade(20);

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());

    }
}
