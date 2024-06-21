public class excel_column {
    public static long column(String str){
        int n=str.length();
        long result=0;
        //ABC
        for (int i = 0; i < n; i++) {
            result=result*26;
            result=result+(str.charAt(i)-'A'+1);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(column("ABC"));
    }
}
