public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
    for(int i=0;i<nums.length;i++){
        hash.add(nums[i]);
    }
    int longest =0;
    for(int i=0;i<nums.length;i++){
        int down =nums[i]-1;
        int up   =nums[i]+1;
        
        while(hash.contains(down)){
            hash.remove(down);
            down--;
        }
        
        while(hash.contains(up)){
            hash.remove(up);
            up++;
        }
        longest = Math.max(longest,up-down-1);
    }return longest;
    }
}