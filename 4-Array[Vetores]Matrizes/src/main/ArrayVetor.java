package main;

public class ArrayVetor {

	public static void main(String[] args) {
		// Array pode ser de todos os tipos de dados e objetos tamb�m
		
		// Array sempre deve ter a quantidade de posi��es definidas
		double notas[] = new double[4];
		
		// Atribuindo valores para posi��es do array
		notas[0] = 9.4;
		notas[1] = 4.5;
		notas[2] = 8.2;
		notas[3] = 6.3;
		
		for(int pos = 0; pos < 4; pos++) {
			System.out.println((pos + 1) + "� nota: " + notas[pos]);
		}
	}
}