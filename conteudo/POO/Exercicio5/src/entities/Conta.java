package entities;

public class Conta {
	
	private int numConta;
	private String titular;
	private double saldo;
	
	public Conta(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public Conta(int numConta, String titular, double initialDeposit) {
		this.numConta = numConta;
		this.titular = titular;
		deposit(initialDeposit);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void withdraw(double amount) {
		
		saldo -= amount + 5;
	}
	
	public void deposit(double amount) {
		
		saldo += amount;
	}
	
	
	
	public String toString() {
		return "Account "
				+ numConta
				+ ", Holder: "
				+ titular
				+ ", Balance: $"
				+ String.format("%.2f", saldo);
				
	}
}
