package aula3;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modele: " + this.modelo);
        System.out.println("Uma Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
        
    }
    
    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO!!! Não posso rabiscar tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
