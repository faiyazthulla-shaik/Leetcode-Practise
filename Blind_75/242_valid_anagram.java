class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(!hashMapS.containsKey(s.charAt(i))){
                hashMapS.put(s.charAt(i), 1);
            }else if(hashMapS.containsKey(s.charAt(i))){
                hashMapS.put(s.charAt(i), hashMapS.get(s.charAt(i))+1);
            }
            
            if(!hashMapT.containsKey(t.charAt(i))){
                hashMapT.put(t.charAt(i), 1);
            }else if(hashMapT.containsKey(t.charAt(i))){
                hashMapT.put(t.charAt(i), hashMapT.get(t.charAt(i))+1);
            }
        }
        if(hashMapT.equals(hashMapS)) return true;
        return false;
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
