package LeetCode_771;

import java.util.HashSet;

/**
 * 题目：771.宝石与石头
 * 日期：2023-07-24
 * 作者：仲景
 */
public class Solution02_ZhongJing {
    public int numJewelsInStones(String jewels, String stones) {
        var charSet = new HashSet<Character>();
        for (int i = 0; i < jewels.length(); i++) {
            charSet.add(jewels.charAt(i));
        }

        var count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (charSet.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
