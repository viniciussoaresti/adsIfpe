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

    // Verifica se duas cidades estão conectadas
    public boolean saoConectados(String cidade1, String cidade2) {
        return grafo.containsKey(cidade1) && grafo.get(cidade1).contains(cidade2);
    }

    // Busca em Profundidade (DFS)
    public void buscaProfundidade(String origem, Set<String> visitado) {
        if (!visitado.contains(origem)) {
            System.out.println(origem);
            visitado.add(origem);
            for (String vizinho : grafo.get(origem)) {
                buscaProfundidade(vizinho, visitado);
            }
        }
    }

    // Busca em Largura (BFS)
    public void buscaLargura(String origem) {
        Set<String> visitado = new HashSet<>();
        Queue<String> fila = new LinkedList<>();
        fila.add(origem);
        visitado.add(origem);

        while (!fila.isEmpty()) {
            String atual = fila.poll();
            System.out.println(atual);
            for (String vizinho : grafo.get(atual)) {
                if (!visitado.contains(vizinho)) {
                    fila.add(vizinho);
                    visitado.add(vizinho);
                }
            }
        }
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
        System.out.println("Grafo:");
        grafo.mostrarGrafo();

        // Verificação de conexão
        System.out.println("\nA e B estão conectados? " + grafo.saoConectados("A", "B"));
        System.out.println("A e D estão conectados? " + grafo.saoConectados("A", "D"));

        // Busca em Profundidade a partir de A
        System.out.println("\nBusca em Profundidade:");
        grafo.buscaProfundidade("A", new HashSet<>());

        // Busca em Largura a partir de A
        System.out.println("\nBusca em Largura:");
        grafo.buscaLargura("A");
    }
}