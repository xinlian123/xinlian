public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0)
        return true;
        int front =0, end = s.length()-1;
        while(front<end){
            while(front<s.length()&&!isvaild(s.charAt(front))){
                front++;
            }
            if(front==s.length()){
                return true;
            }
            while(end>0&&!isvaild(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(front))!=Character.toLowerCase(s.charAt(end))){
                break;
            }
            else{
                front++;
                end--;
            }
        }return end <= front;
    }
    public boolean isvaild(char c){
        return Character.isLetter(c)||Character.isDigit(c);
    }
}