import java.util.Scanner;

public class MatrizOperations {

    public static void main(String[] args) {
        int op = 0;
        Scanner scan = new Scanner(System.in);

        while (true) { 
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Somar duas matrizes");
            System.out.println("2 - Inverter (transpor) uma matriz");
            System.out.println("3 - Sair");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    somarMatrizes();
                    break;
                case 2:
                    inverterMatriz();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scan.close();
                    return; 
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

   
    public static void somarMatrizes() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de linhas das matrizes:");
        int linhas = scan.nextInt();
        System.out.println("Digite o número de colunas das matrizes:");
        int colunas = scan.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] soma = new int[linhas][colunas];

       
        System.out.println("Preencha a primeira matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scan.nextInt();
            }
        }

        
        System.out.println("Preencha a segunda matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = scan.nextInt();
            }
        }

       
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void inverterMatriz() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz:");
        int linhas = scan.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = scan.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int[][] matrizInvertida = new int[colunas][linhas];

       
        System.out.println("Preencha a matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizInvertida[j][i] = matriz[i][j];
            }
        }

      
        System.out.println("Matriz invertida (transposta):");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matrizInvertida[i][j] + " ");
            }
            System.out.println();
        }
    }
}