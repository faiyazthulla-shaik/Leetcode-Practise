class Node {
    private Node[] links;

    private boolean isEnd = false;

    public Node() {
        links = new Node[26];
    }

    public boolean containsKey(char ch){
        if(links[ch - 'a'] != null){
            return true;
        }else{
            return false;
        }
    }

    public Node get(char ch){
        return links[ch - 'a']; 
    }

    public void put(char ch, Node node){
        links[ch - 'a'] = node;
    }

    public void setEnd(){
        isEnd = true;
    }

    public boolean isEnd(){
        return isEnd;
    }
}
class Trie {

    private Node root; 

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node node = root;
        for(int i=0; i<word.length(); i++){
            char currentChar = word.charAt(i);
            if(!node.containsKey(currentChar)){
                node.put(currentChar, new Node());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }
    
    public Node searchPrefix(String word){
        Node node = root;
        for(int i=0; i<word.length(); i++){
            char currentChar = word.charAt(i);
            if(node.containsKey(currentChar)){
                node = node.get(currentChar);
            }else{
                return null;
            }
        }
        return node;
    }

    public boolean search(String word) {
        Node node = searchPrefix(word);
        if(node!=null && node.isEnd()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean startsWith(String prefix) {
        Node node = searchPrefix(prefix);
        if(node!=null){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */