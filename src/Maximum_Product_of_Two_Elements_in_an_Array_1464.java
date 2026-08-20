public class Maximum_Product_of_Two_Elements_in_an_Array_1464 {
    class Solution {
        public int maxProduct(int[] nums) {
            int maxPro = 0;
            for(int i = 0;i<nums.length;i++){
                for(int j = i+1;j<nums.length;j++){
                    int cur = (nums[i] -1) * (nums[j] - 1);
                    if(cur > maxPro){
                        maxPro = cur;
                    }
                }
            }
            return maxPro;
        }
    }
}
