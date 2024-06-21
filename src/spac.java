import java.util.* ;
import java.io.*;
public class spac {
    public static String editSentence(String str){
        ArrayList<Character> a1=new ArrayList<>();
        for (int i = 1; i < str.length(); i++) {
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
               a1.add(' ');
                a1.add(c);
            }
            else{
                a1.add(c);
            }
        }
       return a1.toString();
    }

    public static void main(String[] args) {
        System.out.println(editSentence("highVast"));
    }
}