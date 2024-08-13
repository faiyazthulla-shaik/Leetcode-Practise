class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;

        int colStart = 0;
        int colEnd = matrix[0].length-1;

        List<Integer> list = new ArrayList<>();

        while(rowStart<=rowEnd && colStart<=colEnd){

            //Traverse in column from left and right
            for(int i=colStart; i<=colEnd; i++){
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            //Traverse from top to bottom
            for(int i=rowStart; i<=rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            //Traverse from right to left
            if(rowStart<=rowEnd){
                for(int i=colEnd; i>=colStart; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            //Traverse from bottom to top
            if(colStart<=colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    list.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return list;
    }
}

//Time complexity: O(n.m)
//Space complexity: O(1)
