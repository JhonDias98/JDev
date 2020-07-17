package main;

import model.Aluno;
import model.Diretor;
import model.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jonathan Dias");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Zito");
		diretor.setRegistroGeral("879654123");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("12345678912");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}
}
