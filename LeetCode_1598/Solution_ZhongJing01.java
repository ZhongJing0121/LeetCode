package LeetCode_1598;

/**
 * 1598.文件夹操作日志搜集器
 */
public class Solution_ZhongJing01 {
    public int minOperations(String[] logs) {
        int level = 0;

        for (String log : logs) {
            if (log.contains("../")) {
                // 退回上一级
                level = level == 0 ? 0 : level - 1;
            } else if (!log.contains("./")) {
                level++;
            }
        }

        return Math.max(level, 0);
    }
}
