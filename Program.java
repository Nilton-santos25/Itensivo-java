package intensivo;

public class Program {
    public static void main(String[] args) {
        
        Veiculo carro = new Veiculo();  //instanciando a classe Veiculo
        carro.passageiros = 5; 
        carro.combustivel = 50.0;
        carro.consumo = 10.0;
        
        carro.autonomia(); //chamando o método autonomia da classe Veiculo
    }
    
}
