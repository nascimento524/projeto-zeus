import java.util.Scanner;

public class soma_de_pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        int Z = scanner.nextInt();
        
        while (Z <= X) {
            Z = scanner.nextInt();
        }
        
        int soma = X;
        int quantidadeNumeros = 1;
        
        while (soma <= Z) {
            X++;
            soma += X;
            quantidadeNumeros++;
        }
        
        System.out.println(quantidadeNumeros);
        
        scanner.close();
    }
}
