
public class Main {

	public static void main(String[] args) {
		Cliente giovanni = new Cliente();
		giovanni.setNome("Giovanni");
		
		Conta cc = new ContaCorrente(giovanni); 
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(giovanni);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato(); 

	}

}
