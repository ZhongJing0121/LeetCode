package LeetCode_476;

/**
 * 476.数字的补数
 *
 * @author ZhongJing </p>
 * @date 2024/01/19 </p>
 */
public class Solution_ZhongJing01 {
    public int findComplement(int num) {
        int highBit = 0;
        // 找到最高位的1
        for (int i = 31; i >= 0; i--) {
            if (((num >> i) & 1) != 0) {
                highBit = i;
                break;
            }
        }
        int res = 0;
        for (int i = 0; i < highBit; i++) {
            // 如果当前位是0，那么反数的当前位就是1
            if (((num >> i) & 1) == 0) {
                // 按位或，将反数的当前位设置为1
                res |= (1 << i);
            }
        }
        return res;
    }
}
