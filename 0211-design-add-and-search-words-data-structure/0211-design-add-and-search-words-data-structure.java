class WordDictionary {

    class Node {
        Node[] children = new Node[26];
        boolean isEnd;
    }

    Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                node.children[index] = new Node();
            }

            node = node.children[index];
        }

        node.isEnd = true;
    }
    
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    public boolean dfs(String word, int i, Node node) {
        if (i == word.length()) {
            return node.isEnd;
        }

        char ch = word.charAt(i);

        if (ch == '.') {
            for (Node child : node.children) {
                if (child != null && dfs(word, i + 1, child)) {
                    return true;
                }
            }

            return false;
        } else {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return false;
            }

            return dfs(word, i + 1, node.children[index]);
        }
    }
}