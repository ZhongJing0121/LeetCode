package LeetCode_1108;

/**
 * 1108.IP 地址无效化
 */
public class Solution_ZhongJing01 {
    public String defangIPaddr(String address) {
        var sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
