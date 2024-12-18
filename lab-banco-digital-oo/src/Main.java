
public class Main {

	public static void main(String[] args) {
		Cliente celio = new Cliente();
		celio.setNome("Celio");
		
		Conta cc = new ContaCorrente(celio);
		Conta poupanca = new ContaPoupanca(celio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
