import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String risada = input.nextLine();

        if (risadaEngracada(risada)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }

    public static boolean risadaEngracada(String risada) {
        StringBuilder vogais = new StringBuilder();
        
        // Extrai as vogais da risada
        for (char c : risada.toCharArray()) {
            if (isVogal(c)) {
                vogais.append(c);
            }
        }

        // Verifica se as vogais são iguais na ordem natural e inversa
        String vogaisString = vogais.toString();
        return vogaisString.equals(new StringBuilder(vogaisString).reverse().toString());
    }

    public static boolean isVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
