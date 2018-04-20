
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo += 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(170);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(300, conta)) {
			System.out.println("Transferencia com sucesso");
		}else{
			System.out.println("Faltou dinheiro.");
		}
		
		System.out.println(contaDaMarcela.saldo);
	}
}
