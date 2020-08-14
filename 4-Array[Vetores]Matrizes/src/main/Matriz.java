package main;

public class Matriz {

	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 10;
		notas[0][1] = 20;
		notas[0][2] = 30;
		
		notas[1][0] = 40;
		notas[1][1] = 50;
		notas[1][2] = 60;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("---------------");
			for(int j = 0; j < notas[i].length; j++) {
				System.out.println("Matriz " + notas[i][j]);
			}
		}

	}

}
