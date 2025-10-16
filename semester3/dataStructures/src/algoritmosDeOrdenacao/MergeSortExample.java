package algoritmosDeOrdenacao;

public class MergeSortExample {

    // Método principal do Merge Sort
    public static void mergeSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2; 
            // Como é uma divisão de int, o resultado fica no floor().
            // Divide o array em duas partes
            // Que se subdividem mais ainda, até restarem só duplas (pois na próxima, inicio==fim).
            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);
            // Conquista: mescla as duas metades
            merge(array, inicio, meio, fim);
        }
    }

    // Mescla dois subarrays em ordem
    private static void merge(int[] array, int inicio, int meio, int fim) {
    	// Número de -itens- na esquerda e na direita, onde na esquerda incluimos o elemento do meio
        int n1 = meio - inicio + 1;	// para um array de 5 itens ➡️ 2-0+1=3, para 4, 1-0+1=2
        int n2 = fim - meio; //para um array de 5 itens ➡️ 4-2=2, para 4, 3-1=2
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Copia os elementos para arrays auxiliares
        for (int i = 0; i < n1; i++)
            esquerda[i] = array[inicio + i];
        for (int j = 0; j < n2; j++)
            direita[j] = array[meio + 1 + j];
        /*
         * No caso do inicio ser 0, não importa o +i, ele está ali para casos nos quais o início > 0, ou seja,
         * para evitar o array bater num número antes do certo (dando -1 ou pegando a metade esquerda).
         */
        int i = 0, j = 0;
        int k = inicio;

        // Combina os arrays ordenados
        /*
         * Basicamente, são comparados os dois arrays, onde, se um elemento (ex. esquerda[0]) for menor que
         * o da direita, ele vai para a posição atual (k) do array 'ordenado'. Então, nesse caso, i++, para
         * podermos comparar o próximo número (ex. esquerda[1]) com o mesmo do outro array (ex. direita[0]).
         */
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                array[k] = esquerda[i];
                i++;
            } else {
                array[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes, se houver
        /*
         * Por isso o "reaproveitamento" do i, do j, e do k. Inicialmente o i e j servem para salvar o índice
         * que paramos na comparação dos números. Após isso, aqui, usamos para verificar os elementos
         * remanescentes dos arrays através de i e j, e o k como a última posição preenchida, para após ele,
         * colocarmos os não comparados. 
         */
        while (i < n1) {
            array[k] = esquerda[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = direita[j];
            j++;
            k++;
        }
        System.out.println("Pedaço ordenado: " + inicio + " à "+ fim + ".");
    }

    // Programa principal para testar
    public static void main(String[] args) {
        int[] numeros = {12, 11, 13, 5, 6, 7};

        System.out.println("Array original:");
        imprimeArray(numeros);
        System.out.println("\n");
        
        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("\nArray ordenado:");
        imprimeArray(numeros);
    }
    
 // Método auxiliar para imprimir o array
    private static void imprimeArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}