package algoritmosDeBuscaLinear;

public class Pilha {
    private int tamanho;
    private int topo;
    private int[] elementos;

    // Construtor
    public Pilha(int capacidade) {
        this.tamanho = capacidade;
        this.topo = -1; // Pilha começa vazia
        this.elementos = new int[capacidade];
    }

    // Verifica se está cheia
    public boolean estaCheia() {
        return topo == tamanho - 1;
    }

    // Verifica se está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Empilha (push)
    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("Pilha cheia!");
        } else {
            topo++;
            elementos[topo] = valor;
            System.out.println("Empilhado: " + valor);
        }
    }

    // Desempilha (pop)
    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            int valor = elementos[topo];
            topo--;
            System.out.println("Desempilhado: " + valor);
            return valor;
        }
    }

    // Mostra o topo
    public int verTopo() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return elementos[topo];
    }

    // Mostra todos os elementos da pilha
    public void mostrarPilha() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Elementos da pilha:");
            for (int i = topo; i >= 0; i--) {
                System.out.println(elementos[i]);
            }
        }
    }
    
    public static void main(String[] args) {
    	Pilha pilha = new Pilha(5);
    	pilha.empilhar(1);
    	pilha.empilhar(11);
    	pilha.empilhar(111);
    	pilha.empilhar(1111);
    	pilha.empilhar(11111);
    	pilha.mostrarPilha();
	}
}