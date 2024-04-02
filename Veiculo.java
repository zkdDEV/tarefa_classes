public class Veiculo {
    private String nomeModelo;
    private String nomeMarca;
    private String placa;
    private int anoFabricacao;
    private int anoModelo;


    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void getInformations(){
        System.out.println("****************************");
        System.out.println("Modelo: " + getNomeModelo());
        System.out.println("Marca: " + getNomeMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano do Modelo: " + getAnoModelo());
        System.out.println("Ano de Fabricação" + getAnoFabricacao());
        System.out.println("****************************");
    }
}
