package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Org. uma lista de tarefas usando um ArrayList. O programa deve oferecer as seguintes opções:
 * Adicionar uma nova tarefa, Listar todas as tarefas,Remover uma tarefa pelo índice, Sair do programa.
 */

class Tarefa {
	private String descricao;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}

public class GerenciadorDeTarefas {
	
	private ArrayList<Tarefa> tarefas;
	
	public GerenciadorDeTarefas() {
		tarefas = new ArrayList<Tarefa>();
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
		System.out.println("Tarefa adicionada!\n");
	}
	
	public void visualizarTarefa(int posicao) {
		--posicao;
		if(isPosicaoValida(posicao)) {
			System.out.println("Tarefa " + (posicao+1) + ": "+ this.tarefas.get(posicao).getDescricao());
		}
	}
	
	public void atualizarTarefa(int posicao, Tarefa tarefa) {
		--posicao;
		if(isPosicaoValida(posicao)) {
			this.tarefas.set(posicao, tarefa);
			System.out.println("Tarefa atualizada!\n");
		}
	}
	
	public void removerTarefa(int posicao) {
		--posicao;
		if(isPosicaoValida(posicao)) {
			this.tarefas.remove(posicao);
			System.out.println("Tarefa removida!\n");
		}
	}
	
	public void listarTarefas() {
		if (this.tarefas.size() == 0) {
			System.out.println("Lista vazia, não há acesso às tarefas!");
			return;
		}
		for (int i = 0; i < this.tarefas.size(); i++) {
			System.out.println("Tarefa "+ (i+1) + ": "+ this.tarefas.get(i).getDescricao());
		}
	}
	
	public Tarefa criarNovaTarefa (Scanner in) {
		System.out.print("Insira a descrição da tarefa:");
		return new Tarefa(in.next());
	}
	
	public boolean isPosicaoValida(int posicao) {
		if (this.tarefas.size() == 0) {
			System.out.println("Lista vazia, não há acesso a essa tarefa!");
			return false;
		}
		if (posicao < 0) {
			System.out.println("Posição não pode ser 0 ou negativa!");
			return false;
		}
		if (posicao > this.tarefas.size()) {
			System.out.println("Posição maior que o tamanho da lista!");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
		Scanner in = new Scanner(System.in);
		System.out.println("Bem-vindo(a) ao Gerenciador de Tarefas.\n");
		int opcao = 0;
		while(opcao != 6) {
			System.out.print("Menu principal:\n1:Adicionar tarefa;\n2:Visualizar tarefa;\n3:Atualizar tarefa;\n4:Remover tarefa;\n5:Listar tarefas;\n6:Sair.\n\nInsira a opção: ");
			opcao = in.nextInt();
			switch (opcao){
			case 1:
				gerenciador.adicionarTarefa(gerenciador.criarNovaTarefa(in));
				break;
			case 2:
				gerenciador.visualizarTarefa(in.nextInt());
				break;
			case 3:
				gerenciador.atualizarTarefa(in.nextInt(), gerenciador.criarNovaTarefa(in));
				break;
			case 4:
				gerenciador.removerTarefa(in.nextInt());
				break;
			case 5:
				gerenciador.listarTarefas();
				break;
			case 6:
				break;
			default:
				System.out.println("Opção inválida.\n");
			}
		}
		System.out.println("Obrigado pela preferência!");
		in.close();
	}

}
