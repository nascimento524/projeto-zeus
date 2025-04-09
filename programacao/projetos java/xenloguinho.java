import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casosTeste = scanner.nextInt();

        for (int i = 0; i < casosTeste; i++) {
            int N = scanner.nextInt();
            int quantidadeMinima = quantidadeMinimaEsferas(N);
            System.out.println(quantidadeMinima);
        }
    }

    // Função para calcular a quantidade mínima de esferas necessárias
    public static int quantidadeMinimaEsferas(int N) {
        int quantidadeMinima = 0;

        for (int i = 2; i <= N; i++) {
            if (quantidadeDivisores(i) % 2 == 0) {
                quantidadeMinima++;
            }
        }

        return quantidadeMinima;
    }

    // Função para contar a quantidade de divisores de um número
    public static int quantidadeDivisores(int numero) {
        int quantidade = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                quantidade++;
            }
        }

        return quantidade;
    }
}
