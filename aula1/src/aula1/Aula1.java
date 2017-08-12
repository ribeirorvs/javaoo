package aula1;

public class Aula1 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta();
        c2.cor = "azul";
        c2.ponta = 0.7f;
        c2.carga = 50;
        
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
