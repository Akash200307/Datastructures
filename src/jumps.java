import java.util.Scanner;

public class jumps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(canReachK(N, K));
    }

    private static int canReachK(int N, int K) {
        // Loop through possible starting points
        for (int start = 1; start <= N; start++) {
            int current = start;
            int jumps = 0;

            // Try to reach K with incremental jumps
            while (current < K && current <= N) {
                jumps++;
                current += jumps;
            }

            if (current == K && jumps >= 2) {
                return 1;
            }
        }

        return 0;
    }
}
