
package projetocontabancaria;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if ("cc".equals(tipo)){
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta");
    }
    
    public void fecharConta() {
        if(this.getSaldo() > 0){
            System.out.println("Conta com saldo");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta negativa");
        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada");
        }
    }
    
    public void sacar(float v) {
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta inexistente");
        }
    }
    
    public void depositar(float v) {
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Conta inexistente");
        }
    }
    
    public void pagarMensalidade() {
        int v;
        if("cc".equals(getTipo())){
            v = 12;
        } else {
            v = 20;
        }
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta inexistente");
        }
    }
    
    public void estadoAtual() {
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta() );
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Slado: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

}
