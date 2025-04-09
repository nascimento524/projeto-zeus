import java.util.Scanner;

public class quadrado_e_ao_cubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            
            System.out.println(i + " " + quadrado + " " + cubo);
        }
        
        scanner.close();
    }
}
