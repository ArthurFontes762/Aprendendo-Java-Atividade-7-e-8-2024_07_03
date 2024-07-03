// Exemplo de Uso de Construtor

public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro("HBO-1234", 15, 2, "Azul Bebê");
        Carro maverick = new Carro("MAV-0800", "Marrom");
        System.out.println("Características do Fusca");
        System.out.println("Placa: "+fusca.placa+", Aro: "+fusca.aroDaRoda+", Portas: "+fusca.portas+", Cor: "+fusca.cor);
        System.out.println("Caracteristicas do Maverick");
        System.out.println("Placa: "+maverick.placa+", Cor: "+maverick.cor);
        }
    }