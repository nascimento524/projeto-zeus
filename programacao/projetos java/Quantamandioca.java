import java.util.Scanner;

public class Quantamandioca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int curupira = scanner.nextInt();
        int boitata = scanner.nextInt();
        int boto = scanner.nextInt();
        int mapinguari = scanner.nextInt();
        int iara = scanner.nextInt();
        
        int totalMandioca = curupira * 300 + boitata * 1500 + boto * 600 + mapinguari * 1000 + iara * 150 + 225;
        
        System.out.println(totalMandioca);
        
        scanner.close();
    }
}
