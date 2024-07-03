// Exemplo de Uso de Construtor

public class Carro {
    String placa;
    int aroDaRoda;
    int portas;
    String cor;

    public Carro (String placa, int aroDaRoda, int portas, String cor){
        this.placa = placa;
        this.aroDaRoda = aroDaRoda;
        this.portas = portas;
        this.cor = cor;
    }

    public Carro (String placa, String cor){
        this.placa = placa;
        this.cor = cor;
    }
}
