package week7.implementTriePrefixTree;

/**
 * @program: algorithm020
 * @description: 208. 实现 Trie (前缀树)
 * {@link: <a href="https://leetcode-cn.com/problems/implement-trie-prefix-tree/#/description">}
 * @author: Colin Ting
 * @create: 2021-05-22 21:57
 **/
class TrieNode {

    public char val;
    public TrieNode[] children = new TrieNode[26];
    public boolean isWord;

    public TrieNode() {

    }

    public TrieNode(char c) {
        TrieNode trieNode = new TrieNode();
        trieNode.val = c;
    }
}

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }

    public void insert(String word) {
        TrieNode ws = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ws.children[c - 'a'] == null) {
                ws.children[c - 'a'] = new TrieNode(c);
            }
            ws = ws.children[c - 'a'];
        }
        ws.isWord = true;
    }



    public boolean search(String word) {

        TrieNode ws = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ws.children[c - 'a'] == null) {
                return false;
            }
            ws = ws.children[c - 'a'];
        }
        return ws.isWord;
    }


    public boolean startsWith(String prefix) {

        TrieNode ws = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (ws.children[c - 'a'] == null) {
                return false;
            }
            ws = ws.children[c - 'a'];
        }
        return true;
    }

}
