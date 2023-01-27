package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	int codice;
	String nome, descrizione;
	float prezzo, iva;

	public Prodotto(String nome, String descrizione, float prezzo, float iva) {
		super();
		Random r = new Random();
		codice = r.nextInt(1000);
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	float prezzoBase() {
		return prezzo;
	}

	float prezzoIva() {
		float prezzoIva = prezzo + (prezzo * iva / 100);
		return prezzoIva;

	}

	String nomeEsteso() {
		String nomeEsteso = nome +"-"+ codice;
		return nomeEsteso;
	}

	String codiceBonus() {
		// inserisce al massimo con 8 zeri
		return String.format("%08d", codice);
	}

}
