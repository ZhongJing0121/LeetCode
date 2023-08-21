package LeetCode_2337;

/**
 * 2337.移动片段得到字符串
 *
 * @author ZhongJing </p>
 * @date 2023/08/21 </p>
 */
public class Solution_ZhongJing01 {
    public boolean canChange(String start, String target) {
        var s1 = start.toCharArray();
        var s2 = target.toCharArray();
        var i = 0;
        var j = 0;
        var len = s1.length;


        while (i < len && j < len) {
            while (i < len && s1[i] == '_') i++;
            while (j < len && s2[j] == '_') j++;

            // 如果i和j不一样，false
            if (i < len && j < len) {
                // 如果i和j的相对位置元素不一样，一定错
                // 如果相对位置元素为L，但是target的元素的位置比我还靠右，一定错
                // 如果相对位置元素为R，但是target的元素的位置比我还靠左，一定错
                if ((s1[i] != s2[j]) || (s1[i] == 'L' && i < j) || (s1[i] == 'R' && i > j)) return false;
                i++;
                j++;
            }
        }

        while (i < len) {
            if (s1[i++] != '_') return false;
        }

        while (j < len) {
            if (s2[j++] != '_') return false;
        }

        return true;
    }

}
