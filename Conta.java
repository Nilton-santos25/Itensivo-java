package intensivo;

public class Conta {
    
    private Integer numero;
    private String titular;
    protected Double saldo; //modificando a visibilidade para ser acessado em outras classes
    
    //construtor vazio para a classe conta
    public Conta (){
        
    }
    //criando o construtor para a classe
    public Conta(Integer numero, String titular, Double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    Conta(int i, String fafram, double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // estrutura get
    public Integer getNumero(){
        return numero;
    } 
    
    //estrutura set
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void saque( double valor) {
        saldo -= valor + 5.0;
    }
    
    public void deposito(double valor) {
        saldo += valor;
    }
    
}
