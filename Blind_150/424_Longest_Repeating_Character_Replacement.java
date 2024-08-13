class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> hm = new HashMap<>();
        int left=0, right=0;
        int mostFreq=0, maxLength = 0;
        while(right<s.length()){
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right), 0)+1);
            mostFreq = Math.max(mostFreq, hm.get(s.charAt(right)));

            if((right-left+1)-mostFreq > k){
                hm.put(s.charAt(left), hm.get(s.charAt(left))-1);
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
