
package primeiraativide;

public class Usuario {
    private String cpf;
    private String nome;
    private double somaNota;
    private int qtdeCorridas;
    
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

    public double getSomaNota() {
        return somaNota;
    }

    public void setSomaNota(double somaNota) {
        this.somaNota = somaNota;
    }

    public int getQtdeAvaliacao() {
        return qtdeCorridas;
    }

    
    
    
}
