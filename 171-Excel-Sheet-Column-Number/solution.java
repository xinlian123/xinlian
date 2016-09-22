public class Solution {
    public int titleToNumber(String s) {
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char c ='A';
        for(int i = 1;i<=26;i++){
           map.put(c,i);
            c+=1;
        }
        int res = 0;
        int length = s.length()-1;
        int t=0;
        while(length>=0){
            char curr = s.charAt(length);
            res = res +(int)Math.pow(26,t)*map.get(curr);
            t++;
            length--;
        }return res;
    }
}