public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encryptedStr = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            encryptedStr.append(strs.get(i));
            encryptedStr.append("π");
        }
        return encryptedStr.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        StringBuilder decrypt = new StringBuilder();
        List<String> output = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='π'){
                decrypt.append(s.charAt(i));
            }
            if(s.charAt(i) == 'π'){
                output.add(decrypt.toString());
                decrypt.setLength(0);
            }
        }
        return output;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));

//Time complexity: O(n)
//Space complexity: O(k)
