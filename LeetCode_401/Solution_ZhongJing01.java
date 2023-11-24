package LeetCode_401;

import java.util.ArrayList;
import java.util.List;

/**
 * 401.二进制手表
 *
 * @author ZhongJing </p>
 * @date 2023/10/31 </p>
 */
public class Solution_ZhongJing01 {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    res.add(i + ":" + (j < 10 ? "0" : "") + j);
                }
            }
        }
        return res;
    }
}
