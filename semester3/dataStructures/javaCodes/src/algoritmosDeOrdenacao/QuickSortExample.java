package algoritmosDeOrdenacao;

public class QuickSortExample {		
    // Método principal do QuickSort
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particiona(array, inicio, fim);
            quickSort(array, inicio, indicePivo - 1); // Ordena a parte esquerda
            quickSort(array, indicePivo + 1, fim);   // Ordena a parte direita
            /*
             * No caso de um array de 1 item apenas: início(0) == fim(0)
             * No caso de um array de 2 itens apenas: início(0) == fim(1) -> executa o método de particionar,
             * entra direto no if e: caso <= -> troca 0 com 0 e 1 com 1, caso > -> faz a última troca apenas 
             */
        }
    }

    // Método para particionar o array
    private static int particiona(int[] array, int inicio, int fim) {
        int pivo = array[fim]; // Pega o último elemento como pivô
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) { //até o penúltimo elemento apenas
            if (array[j] <= pivo) {
                i++;
                trocar(array, i, j);
            }
        }
        trocar(array, i + 1, fim);
        return i + 1;
        /*
         * Minhas palavras: o pivô (apenas seu valor numérico, já que sabemos que ele está no fim),
         * funciona como o número 'base' comparador para todos os números. Na esquerda os <= e na direita >.
         * O 'i', funciona como o índice da separação, ou seja, ele começa como -1, pois não sabemos ainda
         * as informações dos números <, ==, >.
         * A cada iteração do for, se por acaso, o número comparado no índice j for <= ao pivô, significa
         * que temos um número que ficará ao seu lado esquerdo.
         * Então no caso, aumentamos o índice 'i' para 0, e transformamos esse número recém comparado no
         * primeiro item dos números <= à esquerda. O processo se repete colocando os números <= nas posições
         * à esquerda do pivô.
         * No final de tudo, temos os números <= à esquerda, mas notemos que o pivô não teve sua posição
         * modificada, permanecendo na última. Então, trocamos a posição dele com o item seguinte à última
         * comparação de resultado positivo (i+1, fim), então poderemos ter certeza que o pivô possui apenas
         * itens <= a ele em sua esquerda, e retornamos o índice do mesmo (também i+1).
         */
    }

    // Programa principal para testar
    public static void main(String[] args) {
        int[] numeros = {10, 7, 8, 9, 1, 5};
        System.out.println("Array original:");
        imprimeArray(numeros);

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nArray ordenado:");
        imprimeArray(numeros);
    }

    // Método auxiliar para imprimir array
    private static void imprimeArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Método auxiliar para trocar elementos
    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}