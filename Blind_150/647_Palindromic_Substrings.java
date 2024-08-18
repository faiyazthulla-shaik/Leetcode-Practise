class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for(int diff=0; diff<n; diff++){
            for(int i=0, j=diff; j<n; i++,j++){
                if(i == j){
                    dp[i][j] = true;
                } else if(diff == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+i][j-1] == true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }

                if(dp[i][j] == true){
                    count++;
                }
            }
        }
        return count;
    }
}

//Time complexity: O(n^2)
//Space complexity: O(n^2)
