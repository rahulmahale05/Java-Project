package DSA.day10;

public class Trie {
    static class Node {
        Node children[];
        boolean eow;

        public Node(){
            children = new Node[26];
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1) curr.children[idx].eow = true;
            curr = curr.children[idx];
        }
    }
    public static boolean search(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null) return false;
            if(i == word.length()-1 && curr.children[idx].eow == false) return false;
            curr = curr.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0) return true;

        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)) return true;
        }
        return false;
    }
    public static boolean checkPrefix(String prefix){
        Node curr = root;
        if(prefix.length() == 0) return true;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return true;
    }
    public static int countNodes(Node root){
        if(root == null) return 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static String ans = "";
    public static void longestWordPrefix(Node root, StringBuilder temp){
        if(root == null) return ;

        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWordPrefix(root.children[i] , temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        // String words[] = {"the","there","a","their","any"};
        // for (int i = 0; i < words.length; i++) {
        //     insert(words[i]);
        // }
        // System.out.println(search("the"));
        // System.out.println(search("there"));
        // System.out.println(search("thor"));

        // String words[] = {"i","like","sam","samsung","mobile","ice"};
        // String key = "ilikesamsung";
        // for (int i = 0; i < words.length; i++) {
        //     insert(words[i]);
        // }
        // System.out.println(wordBreak(key));

        // String words[] = {"apple","app","mango","man","woman"};
        // String prefix = "app";
        // String prefix1 = "moon";
        // for (int i = 0; i < words.length; i++) {
        //     insert(words[i]);
        // }
        // System.out.println(checkPrefix(prefix));
        // System.out.println(checkPrefix(prefix1));

        // String str = "ababa";
        // str = "apple";
        // for (int i = 0; i < str.length(); i++) {
        //     insert(str.substring(i));
        // }
        // System.out.println(countNodes(root));

        String words[] ={"a","banana","app","appl","ap","apply","apple"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWordPrefix(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
