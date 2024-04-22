package LeetCode_1832;

public class Solution_ZhongJing01 {
    /**
     * 1832.判断句子是否为全字母句
     */
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        var map = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            map[sentence.charAt(i) - 'a'] = 1;
        }

        for (int j : map) {
            if (j == 0) {
                return false;
            }
        }
        return true;
    }
}
