package aplicacao;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Andre", "andre@gmail.com");
		Pessoa p2 = new Pessoa(2, "Rogeria", "rogeria@gmail.com");
		Pessoa p3 = new Pessoa(3, "Camila", "camila@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
