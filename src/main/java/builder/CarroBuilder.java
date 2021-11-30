package builder;

public class CarroBuilder {

    private Carro carro;

    public CarroBuilder(){
        carro = new Carro();
    }

    public Carro build(){
        if(carro.getFabricante() == ""){
            throw new IllegalArgumentException("Fabricante inválido");
        }
        if(carro.getModelo() == ""){
            throw new IllegalArgumentException("Modelo inválido");
        }
        if(carro.getAno() == 0){
            throw new IllegalArgumentException("Ano inválido");
        }
        return carro;
    }

    public CarroBuilder setFabricante(String fabricante) {
        carro.setFabricante(fabricante);
        return this;
    }
    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }
    public CarroBuilder setAno(int ano) {
        carro.setAno(ano);
        return this;
    }
    public CarroBuilder setPorte(String porte) {
        carro.setPorte(porte);
        return this;
    }
    public CarroBuilder setConfiguracao(String configuracao) {
        carro.setConfiguracao(configuracao);
        return this;
    }
    public CarroBuilder setProcedencia(String procedencia) {
        carro.setProcedencia(procedencia);
        return this;
    }
    public CarroBuilder setCambio(String cambio) {
        carro.setCambio(cambio);
        return this;
    }
    public CarroBuilder setTracao(String tracao) {
        carro.setTracao(tracao) ;
        return this;
    }
    public CarroBuilder setPortas(int portas) {
        carro.setPortas(portas);
        return this;
    }
    public CarroBuilder setOcupantes(int ocupantes) {
        carro.setOcupantes(ocupantes);
        return this;
    }
}
