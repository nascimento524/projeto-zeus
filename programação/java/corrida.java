import java.util.Scanner;

public class corrida{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int C = scanner.nextInt();
        int N = scanner.nextInt();
        
        int pontoTermino = C % N;
        
        System.out.println(pontoTermino);
        
        scanner.close();
    }
}
