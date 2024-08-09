class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isCal = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i=0; i<R; i++){
            if(matrix[i][0] == 0){
                isCal = true;
            }

            for(int j=1; j<C; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1; i<R; i++){
            for(int j=1; j<C; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=0; j<C; j++){
                matrix[0][j]=0;
            }
        }

        if(isCal){
            for(int i=0; i<R; i++){
                matrix[i][0] = 0;
            }
        }
    }
}

// With Extra Space
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
