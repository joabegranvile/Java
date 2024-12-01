package learnJava;

abstract class Bank {
	public Bank() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	// Atributos
	public int numConta;
	public String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Metodos personalizado
	
	public void contaCorrente() {
		
	}
	
	public void contaPoupanca() {
		
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ("CC" == t) this.setSaldo(50);
		if (t == "CP") this.setSaldo(150);
	}
	
	public void saque() {
		
	}
	
	public void deposito() {
		
	}
	
	public void fecharConta() {
		
	}
	
	public void pagarMensal() {
		
	}
	
	// Metodos Especiais

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
	

	