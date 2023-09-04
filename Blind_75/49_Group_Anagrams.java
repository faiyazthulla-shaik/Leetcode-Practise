class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if(!hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList<String>());
            }
            hashMap.get(key).add(strs[i]);
        }
        return new ArrayList(hashMap.values());
    }
}

//Time complexity: O(N. K log K)
//Space complexity: O(NK)`
