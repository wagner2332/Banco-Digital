
public class ContaCorrente extends Conta {
	@Override
	public void imprimirextrato() {
		System.out.println("<<< Extrato Conta Corrente >>>");
		super.imprimirinfoscomuns();

	}
}
