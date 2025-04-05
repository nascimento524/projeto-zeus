import java.util.Scanner;

public class soma_de_pares_consecutivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra1 = input.nextLine();
        String palavra2 = input.nextLine();
        String palavra3 = input.nextLine();

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
