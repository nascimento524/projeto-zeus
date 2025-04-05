import java.util.Scanner;

public class idade_em_dias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int dias = scanner.nextInt();
        
        int anos = dias / 365;
        int meses = (dias % 365) / 30;
        dias = (dias % 365) % 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        
        scanner.close();
    }
}
