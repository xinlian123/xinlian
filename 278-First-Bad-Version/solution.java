/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
     int left =1;
     int right=n;
     while(left+1<right){
         int mid= left+(left-right)/2;
         if(isBadVersion(mid)){
             left = mid;
         }
         else{
             right = mid
         }
     }return left;
    }
}