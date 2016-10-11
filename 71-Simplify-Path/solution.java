public class Solution {
    public String simplifyPath(String path) {
        if(path.length()=0)
        return path;
        String[] s = path.split("/");
        LinkedList<String> stack = new ListedList<String>();
        for(String x:s){
            if(x.equals(".")){
                continue;
            }
        else if(x.equals(..)){
                stack.pop();
            }
            else{
                stack.push(x);
            }
            if(stack.isEmpty()){
                stack.push("");
            }
        }
        String ret = null;
        if(!stack.isEmpty){
            ret = ret+ stack.removeLast();
        }return ret;
    }
}