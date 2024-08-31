class Solution {
    public String betterCompression(String compressed) {
        TreeMap<Character, Integer> hashMap = new TreeMap<>();

        int i=0;
        while(i < compressed.length()){
            char currChar = compressed.charAt(i);
            if(isBetweenAtoZ(currChar)){
                i++;
                StringBuilder sb = new StringBuilder();
                while(i < compressed.length() && isNumber(compressed.charAt(i))){
                    char currNum = compressed.charAt(i);
                    sb.append(currNum);
                    i++;
                }
                if(!hashMap.containsKey(currChar)){
                    hashMap.put(currChar, Integer.parseInt(sb.toString()));
                }else{
                    hashMap.put(currChar, hashMap.get(currChar)+Integer.parseInt(sb.toString()));
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            res.append(entry.getKey());
            res.append(entry.getValue());
        }
        return res.toString();
    }
    public static boolean isBetweenAtoZ(Character ch){
        return ch>='a' && ch<='z';
    }

    public static boolean isNumber(Character ch){
        return ch>='0' && ch<='9';
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
