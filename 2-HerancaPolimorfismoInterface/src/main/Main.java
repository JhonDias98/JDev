package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classesAuxiliares.FuncaoAutenticacao;
import constantes.StatusAluno;
import interfaces.PermitirAcesso;
import model.Aluno;
import model.Disciplina;
import model.Secretario;

public class Main {
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		PermitirAcesso permitirAcessoSecretario = new Secretario(login, senha);
		
		if(new FuncaoAutenticacao(permitirAcessoSecretario).autenticar(login, senha)) {
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			/* É uma lista que dentro dela temos uma chave que indentifica uma sequencia de valores*/
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			for(int qtd = 0; qtd < 5; qtd++) {
				
				/*Usando JOptionPane para deixar dinamico*/
				String nome = JOptionPane.showInputDialog("Qual o nome do " + (qtd+1) + "º aluno ");
				String idade = JOptionPane.showInputDialog("Idade");	
				String dataNascimento = JOptionPane.showInputDialog("Ano de nascimento");
				String registroGeral = JOptionPane.showInputDialog("Informa seu RG");
				String numeroCpf = JOptionPane.showInputDialog("Informe seu CPF");
				String nomeMae = JOptionPane.showInputDialog("Nome da Mãe");
				String nomePai = JOptionPane.showInputDialog("Nome do Pai");
				String dataMatricula = JOptionPane.showInputDialog("Informe a data de sua matricula");
				String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
				String serieMatriculado = JOptionPane.showInputDialog("Informe sua serie atual");
			
		
				/*Criando/instanciando um objeto*/
				Aluno aluno = new Aluno();
			
				aluno.setNome(nome);
				aluno.setIdade(Integer.valueOf(idade));
				aluno.setDataNascimento(dataNascimento);
				aluno.setRegistroGeral(registroGeral);
				aluno.setNumeroCpf(numeroCpf);
				aluno.setNomeMae(nomeMae);
				aluno.setNomePai(nomePai);
				aluno.setDataMatricula(dataMatricula);
				aluno.setNomeEscola(nomeEscola);
				aluno.setSerieMatriculado(serieMatriculado);
			
				/*Adicionando disciplinas na lista*/
				for(int i = 1; i <= 1 ; i++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da "+ i +"º disciplina");
					String nota = JOptionPane.showInputDialog("Informe a "+ i +"º nota");
				
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(nota));
				
					aluno.getDisciplinas().add(disciplina);
				}
			
				/*Removendo disciplinas da lista*/
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
				if(escolha == 0) {
					int continuarRemover = 0;
					int posicao = 1;
				
					while(continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4");
						aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao ++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
				}
				alunos.add(aluno);
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			
			for(Aluno aluno : alunos) {
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else {
					if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}
			}
			
			System.out.println("--------------- Lista dos alunos aprovados ---------------");
			for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ", com a média de: " + aluno.getMediaNota());
				/*Quando o retorno é bollean, pode usar a saéda abaixo*/
				/*System.out.println("Resultado final: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));*/
				for(Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println("Matéria: " + disciplina.getDisciplina() + ", nota: " + disciplina.getNota());
				}
			}
			
			System.out.println("--------------- Lista dos alunos em recuperação ---------------");
			for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ", com a média de: " + aluno.getMediaNota());
				for(Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println("Matéria: " + disciplina.getDisciplina() + ", nota: " + disciplina.getNota());
				}
			}
			
			System.out.println("--------------- Lista dos alunos reprovados ---------------");
			for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno: " + aluno.getNome());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2() + ", com a média de: " + aluno.getMediaNota());
				for(Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println("Matéria: " + disciplina.getDisciplina() + ", nota: " + disciplina.getNota());
				}
			}
			
			
			/*Percorrendo a lista de alunos e trocando as informaéées de um determinado aluno*/
			/*for(int pos = 0; pos < alunos.size(); pos++) {
				Aluno aluno = alunos.get(pos);
				
				/*Trocando as informações de um determinado aluno*/
				/*if(aluno.getNome().equalsIgnoreCase("Jonathan")) {
					
					Aluno trocar = new Aluno();
					trocar.setNome("Aluno foi trocado");
					
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina("Matematica");
					disciplina.setNota(95);
					
					trocar.getDisciplinas().add(disciplina);
					alunos.set(pos, trocar);
					aluno = alunos.get(pos);
				}
			}*/

					
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
		} else {
			System.out.println("Acesso não permitido");
		}
	}
}
