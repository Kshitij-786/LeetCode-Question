public class Valid_Plaindrome_125 {
    class Solution {
        public boolean isPalindrome(String s) {
            int l = 0,r = s.length()-1;
            boolean isPalindrome = true;
            while(l<=r){
                if(!Character.isLetterOrDigit(s.charAt(l))){
                    l++;
                    continue;
                }
                if(!Character.isLetterOrDigit(s.charAt(r))){
                    r--;
                    continue;}
                if(Character.toLowerCase(s.charAt(l)) !=  Character.toLowerCase(s.charAt(r))){
                    isPalindrome = false;
                }
                l++;
                r--;
            }
            return isPalindrome;
        }
    }
}
