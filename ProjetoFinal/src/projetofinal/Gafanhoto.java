package projetofinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public int getTotAssistido() {
        return totAssistido;
    }
    
    
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    public void viuMaisUm(){
        
    }
}
