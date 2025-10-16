package algoritmosDeBuscaLinear;

public class BuscaLinear {

    // Algoritmo de busca linear
    public static int buscar(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i; // retorna a posição onde encontrou
            }
        }
        return -1; // valor não encontrado
    }

    public static void main(String[] args) {
        // Estrutura de dados: vetor de inteiros
        int[] numeros = {10, 20, 30, 40, 50, 60};

        int valorProcurado = 40;

        // Chamada do algoritmo
        int resultado = buscar(numeros, valorProcurado);

        if (resultado != -1) {
            System.out.println("Valor encontrado na posição: " + resultado);
        } else {
            System.out.println("Valor não encontrado no vetor.");
        }
    }
}