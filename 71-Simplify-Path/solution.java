public class Solution {
    public String simplifyPath(String path) {
if(path.length()==0)
        return path;
        
        String[] s = path.split("/");
        LinkList<String> stack = new LinkList<String>();
        
        for(String x : s){
            if(x.equals(".")){
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
            
            if(stack.isEmpty()){
                stack.push("");
            }
            String ret = null;
            while(!stack.isEmpty()){
                ret = ret+stack.removeLast();
            }return ret;
        }
    }
}