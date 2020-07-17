package main;

import model.Aluno;
import model.Diretor;
import model.Pessoa;
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
		secretario.setNome("Glaucia");
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("12345678912");
		secretario.setIdade(35);
		
		System.out.println("--------------ALUNO----------------");
		System.out.println(aluno);
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println("Sal�rio: " + aluno.salario());
		
		System.out.println("--------------DIRETOR----------------");
		System.out.println(diretor);
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println("Sal�rio: " + diretor.salario());
		
		System.out.println("--------------SECRETARIO----------------");
		System.out.println(secretario);
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println("Sal�rio: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essaa pessoa � demais: " + pessoa.getNome() + ", o seu sal�rio �: " + pessoa.salario());
	}
	
}
