

class PrefixTree {

    TrieNode root = null;

    public PrefixTree() {

        root = new TrieNode();
         
    }

    public void insert(String word) {
        TrieNode node = root;

        for(Character c: word.toCharArray()){

            if(!node.children.containsKey(c)){
               node.children.put(c,new TrieNode());
            }

            node = node.children.get(c);
        }

        node.isWord = true;

    }

    public boolean search(String word) {

        TrieNode node = root;

        for(Character c: word.toCharArray()){

            if(!node.children.containsKey(c)){
               return false;
            }

            node = node.children.get(c);
        }

        if(node.isWord == true)
          return true;

        return false;

    }

    public boolean startsWith(String prefix) {

        if(searchPrefix(prefix))
          return true;

        return false;

    }

    public boolean searchPrefix(String prefix) {

       TrieNode node = root;

        for(Character c: prefix.toCharArray()){

            if(!node.children.containsKey(c)){
               return false;
            }

            node = node.children.get(c);
        }

        return true;
    }

}

class TrieNode{
   
   Map<Character, TrieNode> children = new HashMap<>();
   boolean isWord = false;

}
