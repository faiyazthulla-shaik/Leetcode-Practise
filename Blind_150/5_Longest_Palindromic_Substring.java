class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String ans = null;
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int diff = 0; diff<n; diff++){
            for(int i=0, j=diff+i; j<n; i++,j++){
                if(i == j){
                    dp[i][j] = 1;
                }else if(diff == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 2;
                    }else{
                        dp[i][j] = 0;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]>0){
                        dp[i][j] = dp[i+1][j-1]+2;
                    }
                }

                if(dp[i][j]>0 && j-i+1 > maxLength){
                    maxLength = j-i+1;
                    ans = s.substring(i, i+maxLength);
                }
            }
        }
        return ans;
    }
}

//Time complexity: O(n^2)
//Space complexity: O(n^2)
