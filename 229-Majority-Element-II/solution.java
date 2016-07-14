public class Solution {
    public List<Integer> majorityElement(int[] nums) {
    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
    for(int i:nums){
        if(hash.containsKey(i)){
        hash.put(i,hash.get(i)+1);}
        else{
            hash.put(i,1);
        }
    }
    ArrayList<Integer> res = new ArrayList<Integer>();
    for(Map.Entry<Integer,Integer> entry:hash.entrySet()){
        if(entry.getValue()>nums.length/3)
       res.add(entry.getKey());
    }return res;
    }
}