import java.util.Arrays;
import java.util.Random;

public class App {
    static final int[] tamanhosTesteGrande =  { 31_250_000, 62_500_000, 125_000_000, 250_000_000, 500_000_000 };
    static final int[] tamanhosTesteMedio =   {     12_500,     25_000,      50_000,     100_000,     200_000 };
    static final int[] tamanhosTestePequeno = {          3,          6,          12,          24,          48 };
    static Random aleatorio = new Random();
    static long operacoes;
    static double nanoToMilli = 1.0/1_000_000;
    

    /**
     * Gerador de vetores aleatórios de tamanho pré-definido. 
     * @param tamanho Tamanho do vetor a ser criado.
     * @return Vetor com dados aleatórios, com valores entre 1 e (tamanho/2), desordenado.
     */
    static int[] gerarVetor(int tamanho){
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(1, tamanho/2);
        }
        return vetor;        
    }

    /**
     * Gerador de vetores de objetos do tipo Integer aleatórios de tamanho pré-definido. 
     * @param tamanho Tamanho do vetor a ser criado.
     * @return Vetor de Objetos Integer com dados aleatórios, com valores entre 1 e (tamanho/2), desordenado.
     */
    static Integer[] gerarVetorObjetos(int tamanho) {
        Integer[] vetor = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(1, 10 * tamanho);
        }
        return vetor;
    }


    public static void main(String[] args) {
        int tam1 = 20;
        int tam2 = 40;
        int tam3 = 80;
        Integer[] vetor1 = gerarVetorObjetos(tam1);
        Integer[] vetor2 = gerarVetorObjetos(tam2);
        Integer[] vetor3 = gerarVetorObjetos(tam3);
        

        BubbleSort<Integer> bolha = new BubbleSort<>();
        InsertionSort<Integer> insertion = new InsertionSort<>();
        SelectionSort<Integer> selection = new SelectionSort<>();

        Integer[] vetorOrdenadoBolha1 = bolha.ordenar(vetor1);
        Integer[] vetorOrdenadoInsertion1 = insertion.ordenar(vetor1);
        Integer[] vetorOrdenadoSelection1 = selection.ordenar(vetor1);

        System.out.println("\nVetor ordenado 1 método Bolha:");
        System.out.println("Comparações: " + bolha.getComparacoes());
        System.out.println("Movimentações: " + bolha.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + bolha.getTempoOrdenacao());

        System.out.println("\nVetor ordenado 1 método Insertion:");
        System.out.println("Comparações: " + insertion.getComparacoes());
        System.out.println("Movimentações: " + insertion.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + insertion.getTempoOrdenacao());

        System.out.println("\nVetor ordenado 1 método Selection:");
        System.out.println("Comparações: " + selection.getComparacoes());
        System.out.println("Movimentações: " + selection.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + selection.getTempoOrdenacao());

        Integer[] vetorOrdenadoBolha2 = bolha.ordenar(vetor2);
        Integer[] vetorOrdenadoInsertion2 = insertion.ordenar(vetor2);
        Integer[] vetorOrdenadoSelection2 = selection.ordenar(vetor2);

        System.out.println("\nVetor ordenado 2 método Bolha:");
        System.out.println("Comparações: " + bolha.getComparacoes());
        System.out.println("Movimentações: " + bolha.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + bolha.getTempoOrdenacao());


        System.out.println("\nVetor ordenado 2 método Insertion:");
        System.out.println("Comparações: " + insertion.getComparacoes());
        System.out.println("Movimentações: " + insertion.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + insertion.getTempoOrdenacao());

        System.out.println("\nVetor ordenado 2 método Selection:");
        System.out.println("Comparações: " + selection.getComparacoes());
        System.out.println("Movimentações: " + selection.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + selection.getTempoOrdenacao());


        Integer[] vetorOrdenadoBolha3 = bolha.ordenar(vetor3);
        Integer[] vetorOrdenadoInsertion3 = insertion.ordenar(vetor3);
        Integer[] vetorOrdenadoSelection3 = selection.ordenar(vetor3);

        System.out.println("\nVetor ordenado 3 método Bolha:");
        System.out.println("Comparações: " + bolha.getComparacoes());
        System.out.println("Movimentações: " + bolha.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + bolha.getTempoOrdenacao());


        System.out.println("\nVetor ordenado 3 método Insertion:");
        System.out.println("Comparações: " + insertion.getComparacoes());
        System.out.println("Movimentações: " + insertion.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + insertion.getTempoOrdenacao());

        System.out.println("\nVetor ordenado 3 método Selection:");
        System.out.println("Comparações: " + selection.getComparacoes());
        System.out.println("Movimentações: " + selection.getMovimentacoes());
        System.out.println("Tempo de ordenação (ms): " + selection.getTempoOrdenacao());

        }



    }

