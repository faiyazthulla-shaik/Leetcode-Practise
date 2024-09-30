class Solution {
    private int K;
    public int[][] highFive(int[][] items) {
        this.K=5;
        TreeMap<Integer, Queue<Integer>> treeMap = new TreeMap<>();
        for(int[] item:items){
            int id = item[0];
            int score = item[1];

            if(!treeMap.containsKey(id)){
                PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
                treeMap.put(id, pq);
            }
            treeMap.get(id).add(score);
        }

        List<int[]> solution = new ArrayList<>();
        for(int id:treeMap.keySet()){
            int sum=0;
            for(int i=0; i<this.K; i++){
                sum = sum+treeMap.get(id).poll();
            }
            solution.add(new int[]{id, sum/this.K});
        }

        int[][] solutionArray = new int[solution.size()][];
        return solution.toArray(solutionArray);
    }
}

//Time Complexity: O(N.log(N))
//Space Complexity: O(N)
