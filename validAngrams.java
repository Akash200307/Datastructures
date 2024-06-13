class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> h1=new HashMap<>();
        h1.put(')','(');
        h1.put('}','{');
        h1.put(']','[');

        Stack<Character> s1=new Stack<>();
        for(char i:s.toCharArray()){
            if(h1.containsKey(i)){
                if(s1.isEmpty()||s1.pop()!=h1.get(i)){
                        return false;
                }
            }
                else{
                s1.push(i);
                }  
            }
         
        
        return s1.isEmpty();
    }
    
}
