package LeetCode_1768;

public class Solution_ZhongJing01 {
    /**
     * 1768.交替合并字符串
     */
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        var newCharArr = new char[len1 + len2];
        int index = 0, index1 = 0, index2 = 0;
        boolean flag = true;
        while (index1 < len1 && index2 < len2) {
            newCharArr[index++] = flag ? word1.charAt(index1++) : word2.charAt(index2++);
            flag = !flag;
        }

        while (index1 < len1) {
            newCharArr[index++] = word1.charAt(index1++);
        }

        while (index2 < len2) {
            newCharArr[index++] = word2.charAt(index2++);
        }

        return new String(newCharArr);
    }
}
