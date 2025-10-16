package algoritmosDeOrdenacao;

public class HeapSortExample {

    // Método principal do Heap Sort
    public static void heapSort(int[] array) {
        int n = array.length;

        // Constrói o heap (rearranja o array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrai elementos do heap um por um
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz (maior elemento) para o fim
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Reconstroi o heap com os elementos restantes
            heapify(array, i, 0);
        }
    }

    // Função para ajustar o heap (heapify)
    private static void heapify(int[] array, int n, int i) {
        int maior = i;       // Inicializa maior como raiz
        int esquerda = 2 * i + 1; // Filho esquerdo
        int direita = 2 * i + 2;  // Filho direito

        // Se filho esquerdo for maior que a raiz
        if (esquerda < n && array[esquerda] > array[maior]) {
            maior = esquerda;
        }

        // Se filho direito for maior que o "maior" até agora
        if (direita < n && array[direita] > array[maior]) {
            maior = direita;
        }

        // Se o maior não for a raiz
        if (maior != i) {
            int troca = array[i];
            array[i] = array[maior];
            array[maior] = troca;

            // Recursivamente aplica heapify na subárvore afetada
            heapify(array, n, maior);
        }
    }

    // Programa principal para testar
    public static void main(String[] args) {
        int[] numeros = {12, 11, 13, 5, 6, 7};

        System.out.println("Array original:");
        imprimeArray(numeros);

        heapSort(numeros);

        System.out.println("\nArray ordenado:");
        imprimeArray(numeros);
    }
    
 // Método auxiliar para imprimir o array
    private static void imprimeArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}