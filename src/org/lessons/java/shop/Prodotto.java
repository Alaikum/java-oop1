package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	int codice;
		String nome, descrizione;
	float prezzo, iva, prezzoIva;

	public Prodotto(String nome, String descrizione, float prezzo, float iva) {
		super();
		Random r = new Random();
		codice = r.nextInt(1000);
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
		prezzoIva = prezzo + (prezzo * iva / 100);
	}

	void prezzoBase() {
		System.out.printf("Il prezzo base del prodotto è %.2f €\n", prezzo);
	}

	void prezzoIva() {
		System.out.printf("Il prezzo del prodotto con l'iva al %.2f%% è di %.2f €\n", iva, prezzoIva);
	}

	void nomeEsteso() {
		String nomeEsteso = nome + codice;
		String codiceBonus = String.format("%08d", codice); // inserisce al massimo con 8 zeri 
		System.out.println("Il nome esteso del prodotto è:" + nomeEsteso);
		System.out.println("Il codice bonus è:" + codiceBonus);
	}

}
