import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X == 1){
            System.out.println("1/1");
            return;
        }
        int k = 2;
        while ((k * (k + 1)) / 2 < X){
            k++;
        }
        int prev = (k-1) * k / 2;
        int pos = X - prev;

        if (k % 2 != 0){
            System.out.printf("%d/%d", (k + 1 - pos), pos);
        } else {
            System.out.printf("%d/%d",pos, (k + 1 - pos));
        }
    }
}
