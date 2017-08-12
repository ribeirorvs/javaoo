package aula1;

public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO!!! Não posso rabsicar tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
}
