import java.util.InputMismatchException;
import java.util.Scanner;

public class Somasimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int A = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int B = scanner.nextInt();

            int SOMA = A + B;

            System.out.println("SOMA = " + SOMA);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
