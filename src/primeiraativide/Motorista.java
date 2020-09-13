
package primeiraativide;

public class Motorista {
    private String cpf;
    private String nome;
    private String cnh;
    private String carro;
    private boolean status;
    private double somaNota;
    private int qtdeCorridas;
    
    
    public void alteraStatus(){
        if (this.status == true) {
            this.status = false;
        }else{
            this.status = true;
        }
    }
    
    public void avaliaMotorista(double nota){
        this.qtdeCorridas++;
        this.somaNota += somaNota;
    }
    
    public double exibeNota(){
        return this.somaNota/this.qtdeCorridas;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
