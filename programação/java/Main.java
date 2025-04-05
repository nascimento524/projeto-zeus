import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Q = scanner.nextInt();
        int[] opinions = new int[Q];

        for (int i = 0; i < Q; i++) {
            opinions[i] = scanner.nextInt();
        }

        int satisfied = 0;
        int unsatisfied = 0;

        for (int opinion : opinions) {
            if (opinion == 0) {
                satisfied++;
            } else {
                unsatisfied++;
            }
        }

        if (satisfied > unsatisfied) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
