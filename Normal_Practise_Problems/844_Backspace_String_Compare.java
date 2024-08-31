class Solution {
    public boolean backspaceCompare(String s, String t) {
        return finalString(s).equals(finalString(t));
    }
    public String finalString(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != '#'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == '#' && !stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
