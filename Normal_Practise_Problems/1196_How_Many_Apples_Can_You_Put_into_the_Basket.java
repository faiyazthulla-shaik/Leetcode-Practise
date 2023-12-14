class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int sum = 0;
        int count = 0;
        for(int i=0; i<weight.length; i++){
            if(sum + weight[i] <= 5000){
                sum += weight[i];
                count++;
            }
        }
        return count;
    }
}
//Testing
