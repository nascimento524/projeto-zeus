import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Número de casos de teste
        for (int i = 0; i < N; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            String resultado = encaixa(A, B) ? "encaixa" : "nao encaixa";
            System.out.println(resultado);
        }
    }

    // Função para verificar se B corresponde aos últimos dígitos de A
    public static boolean encaixa(long A, long B) {
        String strA = String.valueOf(A);
        String strB = String.valueOf(B);

        // Verifica se o tamanho de B é maior que o de A
        if (strB.length() > strA.length()) {
            return false;
        }

        // Verifica se os últimos dígitos de A correspondem a B
        for (int i = 1; i <= strB.length(); i++) {
            if (strA.charAt(strA.length() - i) != strB.charAt(strB.length() - i)) {
                return false;
            }
        }

        return true;
    }
}

