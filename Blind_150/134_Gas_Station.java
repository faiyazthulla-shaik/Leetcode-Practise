class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGain = 0, totalGain = 0, answer = 0;
        for(int i=0; i<gas.length; i++){
            currentGain = currentGain + gas[i] - cost[i];
            totalGain = totalGain + gas[i] - cost[i];
            
            if(currentGain < 0){
                currentGain = 0;
                answer = answer + i;
            }
        }
        if(totalGain >=0) return answer;
        else return -1;
    }
}

//Time complexity: O(n)
//Space complexity: O(1)
