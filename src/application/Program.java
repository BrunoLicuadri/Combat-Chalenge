package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		Integer life;
		Integer atk;
		Integer def;
		int turn;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Vida Inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		atk = sc.nextInt();
		System.out.print("Armadura: ");
		def = sc.nextInt();
		System.out.println();
		
		Champion champ = new Champion (name, life, atk, def);
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Vida Inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		atk = sc.nextInt();
		System.out.print("Armadura: ");
		def = sc.nextInt();
		System.out.println();
		
		Champion champ2 = new Champion (name, life, atk, def);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? T: ");
		turn = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < turn; i++) {
			if(champ.getLife() == 0 || champ2.getLife() == 0) {
				i = turn;
			}
			else {
				champ.takeDamage(champ2);
				System.out.print(champ.Status());
				champ2.takeDamage(champ);
				System.out.print(champ2.Status());
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
