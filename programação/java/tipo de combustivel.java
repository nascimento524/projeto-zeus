import java.util.Scanner;

public class tipo_de_combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        int codigo = 0;
        
        while (true) {
            codigo = scanner.nextInt();
            
            if (codigo == 4) {
                break;
            } else if (codigo >= 1 && codigo <= 3) {
                switch (codigo) {
                    case 1:
                        alcool++;
                        break;
                    case 2:
                        gasolina++;
                        break;
                    case 3:
                        diesel++;
                        break;
                }
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        scanner.close();
    }
}
