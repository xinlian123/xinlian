public class Solution {
    public String reverseString(String s) {
           char x = s.toCharArray();
           int last = s.length()+1;
           for(int i = 0; i<s.length()/2;i++){
               char temp = x[last];
               x[last] = x[i];
               x[i] = temp;
           }return new String(x);
    }
}