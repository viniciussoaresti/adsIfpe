package algoritmosDeBuscaLinear;

public class Fila {
    private int[] elementos;
    private int frente;    // índice do primeiro elemento
    private int tras;      // índice de inserção
    private int tamanho;   // quantidade de elementos
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    // Verifica se a fila está cheia
    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Enfileirar (enqueue)
    public void enfileirar(int valor) {
        if (estaCheia()) {
            System.out.println("Fila cheia! Não é possível adicionar " + valor);
        } else {
            tras = (tras + 1) % capacidade;
            elementos[tras] = valor;
            tamanho++;
            System.out.println("Enfileirado: " + valor);
        }
    }

    // Desenfileirar (dequeue)
    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return -1;
        } else {
            int valor = elementos[frente];
            frente = (frente + 1) % capacidade;
            tamanho--;
            System.out.println("Desenfileirado: " + valor);
            return valor;
        }
    }

    // Mostrar todos os elementos da fila
    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("Elementos na fila:");
            for (int i = 0; i < tamanho; i++) {
                int indice = (frente + i) % capacidade;
                System.out.println("- " + elementos[indice]);
            }
        }
    }
    
    public static void main(String[] args) {
		Fila fila = new Fila(5);
		fila.enfileirar(1);
		fila.enfileirar(11);
		fila.enfileirar(111);
		fila.enfileirar(1111);
		fila.enfileirar(11111);
		fila.mostrarFila();
	}
}