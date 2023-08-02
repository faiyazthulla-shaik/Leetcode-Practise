class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(numsSet.contains(nums[i])) return true;
            else numsSet.add(nums[i]);
        }
        return false;
    }
}
