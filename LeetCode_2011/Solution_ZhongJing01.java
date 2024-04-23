package LeetCode_2011;

/**
 * 2011.执行操作后的变量值
 */
public class Solution_ZhongJing01 {
    public int finalValueAfterOperations(String[] operations) {
        var res = 0;
        for (String operation : operations) {
            switch (operation) {
                case "++X", "X++": {
                    res++;
                    break;
                }
                case "--X", "X--": {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
