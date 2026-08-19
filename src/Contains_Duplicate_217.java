import java.util.*;

public class Contains_Duplicate_217 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0;i<nums.length;i++){
                if(set.contains(nums[i])){
                    return true;
                }
                set.add(nums[i]);

            }
            return false;
        }
    }
}
/// Brute force but Time Limit Exceed

//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        boolean isFound = false;
//        for(int i = 0;i<nums.length;i++){
//            for(int j = i+1;j<nums.length;j++){
//                if(nums[i] == nums[j]){
//                    isFound = true;
//                    break;
//                }
//            }
//        }
//        return isFound;
//    }
//}
