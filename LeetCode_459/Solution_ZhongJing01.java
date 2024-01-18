package LeetCode_459;

/**
 * 459.重复的子字符串
 *
 * @author ZhongJing </p>
 * @date 2024/01/18 </p>
 */
public class Solution_ZhongJing01 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int i = 1; i <= len / 2; i++) {
            // 只有是整数倍的时候才有可能多次构成原字符串
            if (len % i == 0) {
                boolean flag = true;
                for (int j = i; j < len; j++) {
                    // 如果可以构成原字符串，那么每隔i个字符就应该相等
                    if (s.charAt(j) != s.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
}
