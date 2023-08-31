class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hashSet.add(nums[i]);
        }

        int longStreak = 0;
        for(int num : hashSet){
            if(!hashSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(hashSet.contains(currentNum+1)){
                    currentStreak++;
                    currentNum++;
                }
                longStreak = Math.max(currentStreak, longStreak);
            }
        }
        return longStreak;
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
