package algoritmosDeBuscaLinear;

import java.util.Scanner;

// Classe Nó da Lista Encadeada
class No {
    String sabor;
    No proximo;

    No(String sabor) {
        this.sabor = sabor;
        this.proximo = null;
    }
}

// Classe Lista Encadeada
class ListaEncadeada {
    private No inicio;

    public void adicionarNo(String sabor) {
        No novo = new No(sabor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public boolean buscarNo(String saborBuscado) {
        No atual = inicio;
        while (atual != null) {
            if (atual.sabor.equalsIgnoreCase(saborBuscado)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void mostrarNos() {
        No atual = inicio;
        System.out.println("Sabores disponíveis:");
        while (atual != null) {
            System.out.println("- " + atual.sabor);
            atual = atual.proximo;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada sabores = new ListaEncadeada();

        // Inserção (O(n) no pior caso)
        sabores.adicionarNo("Morango");
        sabores.adicionarNo("Chocolate");
        sabores.adicionarNo("Baunilha");
        sabores.adicionarNo("Limão");
        sabores.adicionarNo("Manga");

        System.out.println("===== MENU DE SORVETERIA =====");
        sabores.mostrarNos();

        System.out.print("\nDigite o sabor desejado: ");
        String escolha = scanner.nextLine();

        // Busca (O(n))
        if (sabores.buscarNo(escolha)) {
            System.out.println("Sabor disponível! Aproveite seu sorvete de " + escolha + "!");
        } else {
            System.out.println("Desculpe, esse sabor não está disponível.");
        }
        scanner.close();
    }
}