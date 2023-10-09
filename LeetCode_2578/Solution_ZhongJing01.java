package LeetCode_2578;

import java.util.ArrayList;

/**
 * 2578. 最小和分割
 *
 * @author ZhongJing </p>
 * @date 2023/10/09 </p>
 */
public class Solution_ZhongJing01 {
    public int splitNum(int num) {
        // 保存数字集合
        var numList = new ArrayList<Integer>();
        var count = 0;
        // 获取数字集合
        while (num != 0) {
            // 排除后导0
            if (num % 10 != 0) {
                numList.add(num % 10);
                count++;
            }
            num /= 10;
        }
        // 排序
        numList.sort(Integer::compareTo);
        var num1 = 0;
        var num2 = 0;
        var len = numList.size();
        var len2 = count / 2;
        var len1 = count - len2;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + numList.get(i);
            } else {
                num2 = num2 * 10 + numList.get(i);
            }
        }

        return num1 + num2;
    }
}
