public class Maze {
    public Maze() {
    }

    public static void main(String[] args) {
        System.out.println("ways to reach the end:" + count(3, 3));
        System.out.println("The Paths are :");
        path("", 3, 3);
    }

    static int count(int r, int c) {
        if (r != 1 && c != 1) {
            int down = count(r - 1, c);
            int right = count(r, c - 1);
            return down + right;
        } else {
            return 1;
        }
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
        } else {
            if (r > 1) {
                path(p + "D", r - 1, c);
            }

            if (c > 1) {
                path(p + "R", r, c - 1);
            }

        }
    }
}
