class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            }else if(hashSet.contains(nums[i])){
                return true;
            }
        }
        return false;
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
