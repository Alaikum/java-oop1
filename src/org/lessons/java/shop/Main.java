package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, descrizione;
		float prezzo, iva;
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il nome del prodotto: ");
		nome = s.nextLine();
		System.out.print("Inserisci una breve descrizione del prodotto del prodotto: ");
		descrizione = s.nextLine();
		System.out.print("Inserisci il prezzo del prodotto: ");
		prezzo = s.nextFloat();
		System.out.print("Inserisci il valore dell'IVA del prodotto: ");
		iva = s.nextFloat();

		Prodotto p = new Prodotto(nome, descrizione, prezzo, iva);
		p.prezzoBase();
		p.prezzoIva();
		p.nomeEsteso();
	}

}
