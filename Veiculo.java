package intensivo;

public class Veiculo {
    int passageiros;
    double combustivel;
    double consumo;
    
    void autonomia() {
        System.out.println("Autonomia do veículo: " + consumo * combustivel);
    }
    
}
