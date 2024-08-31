class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> circle = new LinkedList<>();
        for(int i=1; i<=n; i++){
            circle.add(i);
        }

        while(circle.size() != 1){
            for(int i=0; i<k-1; i++){
                int num = circle.remove();
                circle.add(num);
            }
            circle.remove();
        }

        return circle.remove();
    }
}

//Time complexity: O(n * k)
// Space complexity: O (n)
