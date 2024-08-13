class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "").toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder strBu = new StringBuilder();
        if(s.equals(strBu.append(s).reverse().toString())) return true;
        return false;
    }
}
