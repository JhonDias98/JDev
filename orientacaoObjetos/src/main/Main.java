package main;

import javax.swing.JOptionPane;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
		
		/*Usando JOptionPane para ter interação com o desenvolvedor*/
		String nome = JOptionPane.showInputDialog("Qual o seu nome");
		String idade = JOptionPane.showInputDialog("Qual a sua idade");	
		String dataNascimento = JOptionPane.showInputDialog("Ano de nascimento");
		String registroGeral = JOptionPane.showInputDialog("Informa seu RG");
		String numeroCpf = JOptionPane.showInputDialog("Informe seu CPF");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai");
		String dataMatricula = JOptionPane.showInputDialog("Informe a data de sua matricula");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
		String serieMatriculado = JOptionPane.showInputDialog("Informe sua serie atual");
		String disciplina1 = JOptionPane.showInputDialog("Informe a 1° disciplina");
		String nota1 = JOptionPane.showInputDialog("Informe dua 1° nota");
		String disciplina2 = JOptionPane.showInputDialog("Informe a 2° disciplina");
		String nota2 = JOptionPane.showInputDialog("Informe dua 2° nota");
		String disciplina3 = JOptionPane.showInputDialog("Informe a 3° disciplina");
		String nota3 = JOptionPane.showInputDialog("Informe dua 3° nota");
		String disciplina4 = JOptionPane.showInputDialog("Informe a 4° disciplina");
		String nota4 = JOptionPane.showInputDialog("Informe dua 4° nota");
	
		/*Criando/instanciando um objeto*/
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setDisciplina1(disciplina2);
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setDisciplina1(disciplina3);
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setDisciplina1(disciplina4);
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		System.out.println(aluno1.toString());
		System.out.println("Média da nota: " + aluno1.getMediaNota());
		System.out.println("Resultado final: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		/*Equals e hashcode (Diferenciar e comparar objetos)*/
		/*
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jonathan");
		aluno2.setNumeroCpf("123");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Jonathan");
		aluno3.setNumeroCpf("123");
		
		if(aluno2.equals(aluno3)) {
			System.out.println("CPF dos alunos são iguais");
		} else {
			System.out.println("CPF dos alunos não são iguais");
		}
		*/
	}

}
