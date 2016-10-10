public class Solution {
   public String simplifyPath(String path) {
        if(path.length()==0){
        return path;}
        
        String[] s = path.split("/");
        LinkedList<String> stack = new LinkedList<String>();
        
        for(String x : s){
            if(x.equals(".")||x.length()==0){
                continue;
            }
            else if(x.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(x);
            }
        }
            
            if(stack.isEmpty()){
                stack.push("");
            }
            String ret = "";
            while(!stack.isEmpty()){
                ret = ret+"/"+stack.removeLast();
            }return ret;
        
    }
}