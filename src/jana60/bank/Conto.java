package jana60.bank;

import java.util.Random;

public class Conto {

	int numeroConto;
	String nome;
	float saldo;

	// Costruttore
	public Conto(String nome) {
		super();
		Random r = new Random();
		numeroConto = r.nextInt(1000) + 1;
		this.nome = nome;
		saldo = 0;

	}

	String nome() {
		return nome;
	}

	int numeroConto() {
		return numeroConto;
	}

	// formatta il saldo
	String saldo() {
		return String.format("%.2f", saldo);

	}

	float versamento(float v) {

		return (saldo += v);
	}

	float prelievo(float p) {
	if(saldo-p<0) 
	return saldo;
	else  return saldo-=p;
	}
	
	
	

}
