package LeetCode_482;

/**
 * 482.密钥格式化
 *
 * @author ZhongJing </p>
 * @date 2024/01/19 </p>
 */
public class Solution_ZhongJing01 {
    public String licenseKeyFormatting(String s, int k) {
        var sb = new StringBuilder();
        var count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            // 如果碰到-就跳过
            if (s.charAt(i) == '-') {
                continue;
            }
            // 如果是字母就转换成大写
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char) (s.charAt(i) - 32));
            } else {
                sb.append(s.charAt(i));
            }
            count++;
            if (count == k) {
                sb.append('-');
                count = 0;
            }
        }
        // 可能正好是k的倍数，所以要判断一下最后一个是不是-
        if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }
        // 因为是倒序插入的，所以需要翻转
        return sb.reverse().toString();
    }
}
