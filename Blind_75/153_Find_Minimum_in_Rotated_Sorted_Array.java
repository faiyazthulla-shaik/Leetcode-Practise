class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums[0]<nums[nums.length-1] || nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid>0 && nums[mid]<nums[mid-1]) return nums[mid];
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            if(nums[left]<nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}

//Time complexity: O(log n)
//Space complexity: O(1)
