public class dsa {
    public dsa() {
    }

    public static void main(String[] args) {
        System.out.println(jos(7, 3) + 1);
    }

    static int jos(int n, int k) {
        return n == 0 ? 0 : (jos(n - 1, k) + k) % n;
    }
}
