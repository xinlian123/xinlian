public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> Hash = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(Hash.containsKey(i)){
                Hash.put(i,Hash.get(i)+1);
            }
            else{
                Hash.put(i,1);
            }
        }
        ArrayList<Integer> Result = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> entry : Hash.entrySet()){
            if(entry.getValue()>nums.length/3)
            Result.add(entry.getKey());
        }return Result;
    }
}