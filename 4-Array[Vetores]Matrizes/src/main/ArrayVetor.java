package main;

import model.Aluno;
import model.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Jonathan Dias");
		aluno.setNomeEscola("JDev Treinamento");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		
		double[] notasJava = {8.7,5.9,7.5,3.3};
		
		disciplina.setNota(notasJava);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica");
		
		double[] notasLogica = {7.6,3.9,6.4,5.8};
		
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno2 = new Aluno();
		aluno.setNome("Zago");
		aluno.setNomeEscola("JDev");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		
		double[] notasJava2 = {6.3,5.9,9.9,6.4};
		
		disciplina.setNota(notasJava2);
		
		aluno.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina2.setDisciplina("Lógica");
		
		double[] notasLogica2 = {2.4,7.4,8.5,9.7};
		
		disciplina2.setNota(notasLogica2);
		
		aluno.getDisciplinas().add(disciplina4);
		
		
		
		
//		------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int i = 0; i < arrayAlunos.length; i++) {
			for (Disciplina disc : aluno.getDisciplinas()) {
				System.out.print(disc.getDisciplina() + " ");
				
				double maiorNota = 0;
				double menorNota = disc.getNota()[0];
				for (int j = 0; j < disc.getNota().length; j++) {
					System.out.print(disc.getNota()[j] + " ");
					if ( disc.getNota()[j] > maiorNota) {
						maiorNota = disc.getNota()[j];
					}
					if ( disc.getNota()[j] < menorNota) {
						menorNota = disc.getNota()[j];
					}
				}
				System.out.println("Maior nota: " + maiorNota);
				System.out.println("Menor nota: " + menorNota);
			}
		}
	}
}