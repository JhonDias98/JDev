package main;

import model.Aluno;
import model.Diretor;
import model.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jonathan Dias");
		aluno.setIdade(15);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Zito");
		diretor.setRegistroGeral("879654123");
		diretor.setIdade(68);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("12345678912");
		secretario.setIdade(35);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
	}
}
