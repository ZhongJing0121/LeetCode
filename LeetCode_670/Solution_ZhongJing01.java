package LeetCode_670;

/**
 * 670.最大交换
 *
 * @author ZhongJing </p>
 * @date 2024/01/22 </p>
 */
public class Solution_ZhongJing01 {
    public static void main(String[] args) {
        var solution = new Solution_ZhongJing01();
        System.out.println(solution.maximumSwap(99901));
    }

    public int maximumSwap(int num) {
        if (num < 10) {
            return num;
        }

        // 将数字转换为字符数组
        var chars = String.valueOf(num).toCharArray();
        var maxIndex = chars.length - 1;
        var swapIndex1 = -1;
        var swapIndex2 = 0;

        // 倒序遍历，找到从后往前数最大的数
        for (int i = chars.length - 2; i >= 0; i--) {
            if (chars[i] > chars[maxIndex]) {
                // 右边没有比i大的数
                maxIndex = i;
            } else if (chars[i] < chars[maxIndex]) {
                // 右边有比i大的数，记录交换的位置
                swapIndex1 = i;
                swapIndex2 = maxIndex;
            }
        }

        // 如果是-1，表示所有位置的右边都没有比左边大的数，直接返回
        if (swapIndex1 == -1) {
            return num;
        }

        // 交换
        var temp = chars[swapIndex1];
        chars[swapIndex1] = chars[swapIndex2];
        chars[swapIndex2] = temp;

        return Integer.parseInt(new String(chars));
    }
}
