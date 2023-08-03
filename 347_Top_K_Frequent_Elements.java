class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] output = new int[k];
        for(int i=0; i<nums.length; i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], 1);
            }else{
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        for(Map.Entry map: hashMap.entrySet()){
            pq.add(map);
        }
        
        for(int i=0; i<k; i++){
            output[i] = pq.poll().getKey();
        }
        return output;
    }
}

/*
Time complexity : O(Nlog⁡k) if k<N and O(N) in the particular case of N=k. That ensures time complexity to be better
than O(Nlog⁡N)\mathcal{O}(N \log N)O(NlogN).

Space complexity : O(N+k) to store the hash map with not more N elements and a heap with k elements.
*/
