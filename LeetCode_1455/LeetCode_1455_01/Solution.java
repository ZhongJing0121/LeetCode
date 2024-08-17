package LeetCode_1455.LeetCode_1455_01;

/**
 * 1455.检查单词是否为句中其他单词的前缀
 */
public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
