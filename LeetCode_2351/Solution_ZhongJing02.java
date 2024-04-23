package LeetCode_2351;

/**
 * 2351.第一个出现两次的字母
 * 方法二：bitMap
 */
public class Solution_ZhongJing02 {
    public char repeatedCharacter(String s) {
        int z = 0;

        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            var b = c - 'a';
            if ((z & (1 << b)) != 0) {
                return c;
            }
            z |= (1 << b);
        }

        return '0';
    }
}
