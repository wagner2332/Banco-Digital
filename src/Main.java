
public class Main {

	public static void main(String[] args) {
		Cliente wagner = new Cliente();
		wagner.setNome("Wagner Wilson");
		Contato contato = new Contato();
		contato.setemail("wagner_silva2332@hotmail.com");
		
		Conta cc = new ContaCorrente();
		
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(100,poupanca);
		
		
		
		cc.imprimirextrato();
		//poupanca.imprimirextrato();

	}

}
