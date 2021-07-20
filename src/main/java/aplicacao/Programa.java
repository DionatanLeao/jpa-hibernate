package aplicacao;

import dominio.Pessoa;

/***
 * 
 * @author dionatan
 *
 */

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Maria", "maria@email.com");
		Pessoa p2 = new Pessoa(2, "Alex", "alex@email.com");
		Pessoa p3 = new Pessoa(3, "Jonh", "jonh@email.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
