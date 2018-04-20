public class Conta{

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {		//Por convenção, os métodos começam com letra minuscula
    	this.saldo += valor;
    }
    
    public boolean saca (double valor) {
    	if (this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
    	return false;
    }
    
    public boolean transfere(double valor, Conta destino){
    	if (this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
    }
}