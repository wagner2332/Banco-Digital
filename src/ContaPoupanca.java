public class ContaPoupanca extends Conta {
	@Override
	public void imprimirextrato() {
		imprimirinfoscomuns();
	}

	protected void imprimirinfoscomuns() {
		System.out.println("<<< Extrato Conta Poupanca >>>");
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
