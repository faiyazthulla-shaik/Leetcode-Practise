class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0;
        int dirX = 0, dirY = 1;
        for(int i=0; i<instructions.length(); i++){
            if(instructions.charAt(i) == 'G'){
                x = x + dirX;
                y = y + dirY;
            }else if(instructions.charAt(i) == 'L'){
                int temp = dirX;
                dirX = -dirY;
                dirY = temp;
            }else{
                int temp = dirX;
                dirX = dirY;
                dirY = -temp;
            }
        }

        if(x == 0 && y == 0){
            return true;
        }else if(dirX != 0 || dirY != 1){
            return true;
        }else{
            return false;
        }
    }
}

//Time complexity: O(n)
//Space complexity: O(1)
