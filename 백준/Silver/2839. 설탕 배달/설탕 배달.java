import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> anw = new ArrayList<>();

        for (int i = 0; i <= n / 3; i++) {
            for (int j = 0; j <= n / 5; j++) {
                if (3 * i + 5 * j == n) {
                    anw.add(i + j);
                }
            }
        }

        if (!anw.isEmpty()) {
            Collections.sort(anw);
            System.out.println(anw.get(0));
        } else {
            System.out.println(-1);
        }
    }
}
