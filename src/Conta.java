
public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 0001;
	
	private static final int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ;
		}
		@Override
		public void sacar(double valor) {
			
			saldo = saldo - valor;
		}
		@Override
		public void depositar(double valor) {
			
			saldo = saldo + valor;
		}
		@Override
		public void transferir(double valor, Conta contaDestino) {
			
			this.sacar(valor);
			contaDestino.depositar(valor);

			
	}
	
	

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

	
	protected void imprimirinfoscomuns() {
		System.out.println("<<< Extrato Conta Poupanca >>>");
		//System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}


