import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Número de casos de teste
        for (int caso = 1; caso <= T; caso++) {
            int N = scanner.nextInt(); // Número de membros da equipe
            int[] idades = new int[N]; // Array para armazenar as idades dos jogadores

            // Lendo as idades dos jogadores
            for (int i = 0; i < N; i++) {
                idades[i] = scanner.nextInt();
            }

            // Encontrando a idade do capitão
            int idadeCapitao = idades[N / 2]; // O jogador do meio é o capitão

            // Imprimindo a idade do capitão
            System.out.println("Case " + caso + ": " + idadeCapitao);
        }
    }
}
