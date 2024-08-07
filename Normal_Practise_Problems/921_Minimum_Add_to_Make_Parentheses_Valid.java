class Solution {
    public int minAddToMakeValid(String s) {
        int counter = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' && !stack.isEmpty()){
                stack.pop();
            }
            else if(s.charAt(i) == ')' && stack.isEmpty()){
                counter++;
            }
        }

        while(!stack.isEmpty()){
            counter++;
            stack.pop();
        }
        return counter;
    }
}

// Time complexity: O(n)
// Time complexity: (n)
