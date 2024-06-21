public class Solution {
    public static int makeBeautiful(String str) {
        StringBuilder s1 = new StringBuilder(str);
        int count = 0;

        for (int i = 1; i < s1.length() ; i++) {
            if (s1.charAt(i) == s1.charAt(i - 1)) {
                count++;
                if (s1.charAt(i-1) == '0') {
                    s1.setCharAt(i, '1');
                } else {
                    s1.setCharAt(i , '0');
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "01010010101";
        int result = makeBeautiful(str);
        System.out.println("Number of changes made: " + result); // Expected output: 5
    }
}
