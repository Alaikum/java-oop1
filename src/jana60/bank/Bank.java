package jana60.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String nome, option;

		System.out.print("Inserisci il tuo nome: ");
		nome = s.nextLine();
		Conto c = new Conto(nome);
		do {

			System.out.printf("Sei %s e hai %s € nunero di conto: %d\n", c.nome(), c.saldo(), c.numeroConto());
			System.out.print("Scegli un'operazione: \n1)Versa(v)\n2)Preleva(p)\n3)Esci(e)\nDigita la tua scelta: ");
			option = s.nextLine().toLowerCase();

			if (option.equals("v")) {
				System.out.print("Inserisci il tuo versamento: ");
				c.versamento(Float.parseFloat(s.nextLine()));
			}

			if (option.equals("p")) {
				System.out.print("Inserisci il tuo prelievo: ");
				c.prelievo(Float.parseFloat(s.nextLine()));
			}

			
		} while (!option.equals("e"));

		s.close();
	}

}
