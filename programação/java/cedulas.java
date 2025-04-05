import java.util.Scanner;

public class cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int N = scanner.nextInt();
        
    
        System.out.println(N);
        

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];
        
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = N / notas[i];
            N %= notas[i];
        }
        

        for (int i = 0; i < notas.length; i++) {
            System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
        }
        
        scanner.close();
    }
}
