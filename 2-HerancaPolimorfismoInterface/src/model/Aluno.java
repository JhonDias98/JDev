package model;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

public class Aluno extends Pessoa {

	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	

	/*------------------Construtores----------------------------*/
	public Aluno() {/*Cria os dados na memoria - Sendo padrão do Java*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*------------SET é para adicionar ou receber o valor do atributo------------*/
	/*------------GET é para resgatar ou obter o valor do atributo---------------*/
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	/*--------------toString facilita a impressão no terminal no console--------------*/
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
	
	
	/*----------Utilizando HashCode e Equals para verificar se tem cpf iguais---------------*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}


	/*-------------------Métodos---------------------*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 5) {
			if(media >= 7) {
				return StatusAluno.APROVADO;
			}
			return StatusAluno.RECUPERACAO;
		} else {
			return StatusAluno.REPROVADO;
		}
	}
	
	@Override /*Indentifica método e sobreescreve o mesmo*/
	public boolean pessoaMaiorIdade() {
		
		return idade >= 16;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "O aluno é maior de idade" : "O aluno não é maior de idade";
	}

	@Override
	public double salario() {
		return 800;
	}
}
