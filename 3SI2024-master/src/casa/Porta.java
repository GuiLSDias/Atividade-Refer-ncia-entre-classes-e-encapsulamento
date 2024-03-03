package casa;

public class Porta {
    private boolean aberta;

    public Porta(){
        this.aberta = false;
    }
    public void abre(){
        this.aberta = true;
    }
    public void fecha(){
        this.aberta = false;
    }
    public boolean estaAberta(){
        return aberta;
    }
}

