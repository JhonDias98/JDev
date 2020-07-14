package main;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;

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
		
		for(int i = 1; i <= 4 ; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da "+ i +"° disciplina");
			String nota = JOptionPane.showInputDialog("Informe a "+ i +"° nota");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(nota));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}
		
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
