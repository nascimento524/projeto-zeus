import java.util.Scanner;

public class Pressaodoar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pressaoDesejada = scanner.nextInt();
        int pressaoLida = scanner.nextInt();
        
        int diferencaPressao = pressaoDesejada - pressaoLida;
        
        System.out.println(diferencaPressao);
        
        scanner.close();
    }
}
