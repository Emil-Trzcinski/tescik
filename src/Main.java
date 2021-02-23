import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] cinema = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }

        //wydruk macierzy
        for  (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
            }
            System.out.println(Arrays.toString(cinema[i]));
        }

        //test miejsc wolnych i wydruk rzędu
        int row = 0;
        int k = scanner.nextInt();
        int test = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (cinema[i][j] == 0 && cinema[i][j - 1] == cinema[i][j] && k <= n) {
                    test++;
                    if (test == k) {
                        System.out.println(row + 1);
                        return;
                    }

                } else if (cinema[i][j] == 0 && k == 1) {
                    System.out.println(row + 1);
                    return;

                } else {
                    test = 1;
                }
            }

            row++;

            if (i == n - 1 && test != k) {
                System.out.println("0");
            }
        }
    }
}