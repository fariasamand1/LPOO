package propriedades;

public class propriedade {

    private String endereco;
    private double preco;
    private double nHospede;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getnHospede() {
        return nHospede;
    }

    public void setnHospede(double nHospede) {
        this.nHospede = nHospede;
    }

    public propriedade(String endereco, double preco, double nHospede){
        this.endereco = endereco;
        this.preco = preco;
        this.nHospede = nHospede;
    }
}
