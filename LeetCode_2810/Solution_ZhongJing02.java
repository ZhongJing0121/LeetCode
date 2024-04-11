package LeetCode_2810;

public class Solution_ZhongJing02 {
    /**
     * 2810.故障键盘
     */
    public String finalString(String s) {
        // 定义一个和s等长的数组，因为结果最多和s一样
        char[] arr = new char[s.length()];
        // 下一次插入的索引
        var index = 0;

        // 遍历s
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            // 如果当前字符是"i"，反转[0, index-1]范围内的数字
            if (c == 'i') {
                invertStringInRange(arr, 0, index - 1);
                continue;
            }
            // 如果当前字符不是i，直接添加
            arr[index++] = c;
        }

        // 将数组的[0, index]范围转成字符串
        return new String(arr, 0, index);
    }

    /**
     * 反转字符数组的某个区间
     *
     * @param startIndex 开始下标（包含）
     * @param endIndex   结束下标（包含）
     */
    public void invertStringInRange(char[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            var temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
