class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(0) == ')' || s.length()%2 != 0) return false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')' && stack.isEmpty()) return false;
            if(s.charAt(i) == '}' && stack.isEmpty()) return false;
            if(s.charAt(i) == ']' && stack.isEmpty()) return false;
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' && !stack.isEmpty()){
                if(stack.pop() != '(') return false;
            }
            if(s.charAt(i) == '}' && !stack.isEmpty()){
                if(stack.pop() != '{') return false;
            }
            if(s.charAt(i) == ']' && !stack.isEmpty()){
                if(stack.pop() != '[') return false;
            }
        }
        if(!stack.isEmpty()) return false; 
        return true;
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
