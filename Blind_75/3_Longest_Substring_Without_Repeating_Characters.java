class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while(right < s.length()){
            if(!hashSet.contains(s.charAt(right))){
                hashSet.add(s.charAt(right));
                right++;
                max = Math.max(hashSet.size(), max);
            }else{
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}

/*

Sliding window problem. 
Algo:
1. Both left and right pointers points to initial character in the string. 
2. Create a hashSet. 
3. Move the right pointer untill the end and check for below conditions. 
    i. If the character at right pointer is not in the hashset, update the hashset with the character and move the pointer. 
    ii. Set the maximum of hashset size and max value to the initially declared max variable. 
    iii. If the hashset already contains the character, remove the charcter from the hashset and update the left pointer. 
4. Return the max value at the end of the loop.

*/
