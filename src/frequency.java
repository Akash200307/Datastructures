import java.util.HashMap;
import java.util.PriorityQueue;

public class frequency {
    public static String sortByFrequency(int n, String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(h1.containsKey(s.charAt(i))){
                h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
            }
            else{
                h1.put(s.charAt(i),1);
        }
        }
        PriorityQueue<Character> q1=new PriorityQueue<>((b, c)->(h1.get(c)-h1.get(b)));
        StringBuilder s1= new StringBuilder();
        q1.addAll(h1.keySet());
       while (!q1.isEmpty()){
           char c1= q1.poll();
           for (int i=0;i<h1.get(c1);i++){
               s1.append(c1);
           }
       }

        return s1.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortByFrequency(6,"abcABCc"));
    }
}

