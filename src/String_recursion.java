public
class String_recursion {
    public static
    void main(String[] args) {
        skip("", "bsfjajajkja");
        String s1 = "Akash";
    }
    private static
    void skip(String res, String org) {
        if (org.isEmpty()) {
            System.out.println(res);
            return;
        }
        char c = org.charAt(0);
        if (c == 'a') {
            skip(res, org.substring(1));
        }
        else {
            skip(res + c, org.substring(1));
        }
    }
}
