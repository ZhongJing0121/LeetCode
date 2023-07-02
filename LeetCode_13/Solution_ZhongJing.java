package LeetCode_13;

import java.util.HashMap;
import java.util.Map;

/**
 * 日期：2023-07-02 <br>
 * 作者：仲景
 */
public class Solution_ZhongJing {
    public int romanToInt(String s) {

        /*
            思路：如果前一个字符表示的数比后一个小，就表示后面的数减去前面的数，也就是sum=(-pre+post)
         */

        // 定义一个hash表，存储每个字符对应的值
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // 记录数字的值
        int sum = 0;

        // 遍历字符串
        for (int i = 0; i < s.length() - 1; i++) {
            int num = map.get(s.charAt(i));
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                num = -num;
            }
            sum += num;
        }
        return sum + map.get(s.charAt(s.length() - 1));
    }
}