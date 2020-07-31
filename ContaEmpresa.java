package intensivo;

public class ContaEmpresa extends Conta { //herdando os atributos de conta
    
    private Double limiteEmprestimo;
    
    //construtor vazio da classes
    public ContaEmpresa(){
        
    }
    
    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo){
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public Double getlimiteEmprestimo(){
        return limiteEmprestimo;
    }
    
    public void setlimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public void emprestimo(double valor) {
        if(valor <= limiteEmprestimo) {
            saldo += valor - 10.0;
        }
    }
    
    @Override
    public void saque(double valor){
        super.saque(valor);
        saldo -= 2.0;
    }
}