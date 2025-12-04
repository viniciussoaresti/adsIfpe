import java.util.*;

public class GrafoSimples {
    private Map<String, List<String>> grafo;

    public GrafoSimples() {
        grafo = new HashMap<>();
    }

    // Adiciona um vértice (cidade)
    public void adicionarVertice(String cidade) {
        grafo.putIfAbsent(cidade, new ArrayList<>());
    }

    // Adiciona uma aresta (ligação entre cidades)
    public void adicionarAresta(String cidade1, String cidade2) {
        grafo.get(cidade1).add(cidade2);
        grafo.get(cidade2).add(cidade1); // Para grafo não direcionado
    }

    // Imprime o grafo
    public void mostrarGrafo() {
        for (String cidade : grafo.keySet()) {
            System.out.println(cidade + " -> " + grafo.get(cidade));
        }
    }

    public static void main(String[] args) {
        GrafoSimples grafo = new GrafoSimples();

        // Adicionando vértices
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");

        // Adicionando arestas
        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("A", "C");
        grafo.adicionarAresta("B", "D");

        // Exibindo o grafo
        grafo.mostrarGrafo();
    }
}
