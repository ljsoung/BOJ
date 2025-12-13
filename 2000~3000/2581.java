import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int min = -1;
        int sum = 0;

        if (N < 2){
            System.out.println(-1);
            return;
        }

        for (int i = M; i <= N; i++) {
            if (i < 2){
                continue;
            }
            boolean sosu = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0){
                    sosu = false;
                    break;
                }
            }
            if (sosu){
                sum += i;
                if (min == -1){
                    min = i;
                }
            }
        }
        if (min == -1){
            System.out.println(min);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
