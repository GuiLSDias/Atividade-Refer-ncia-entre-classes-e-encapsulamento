package casa;

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(){
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void pinta(){
        this.cor = cor;
    }
    public int quantasPortasEstaoAbertas(){
        int count = 0;
        if(porta1.estaAberta())count++;
        if(porta2.estaAberta())count++;
        if(porta3.estaAberta())count++;
        return count;
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa();
        minhaCasa.setCor("Azul");

        minhaCasa.porta1.abre();
        minhaCasa.porta2.abre();
        minhaCasa.porta3.abre();

        System.out.println("Numero de portas abertas: "+minhaCasa.quantasPortasEstaoAbertas());
    }
}
