package intensivo;

public class ContaPoupanca extends Conta{ //herdando os atributos de conta
    
    private Double juros;
    

    public ContaPoupanca(Integer numero,String titular,Double saldo, Double juros){
        super(numero,titular,saldo);
        this.juros = juros;
    }
    //get
    public Double getJuros(){
        return juros;
    }
    //set
    public void setJuros(Double juros){
        this.juros = juros;
    } 
    
    public void atualizaSaldo() {
        saldo += saldo * juros;
    }
    
    @Override  //sobrescrevendo o método sauque da classe Conta 
    public void saque(double valor) {
        saldo -= valor;
    }
}
