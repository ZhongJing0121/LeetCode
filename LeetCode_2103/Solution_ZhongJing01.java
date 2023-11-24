package LeetCode_2103;

/**
 * 2103.环和杆
 *
 * @author ZhongJing </p>
 * @date 2023/11/20 </p>
 */
public class Solution_ZhongJing01 {
    public int countPoints(String rings) {
        int[][] arr = new int[10][3];
        int res = 0;
        for (int i = 0; i < rings.length(); i += 2) {
            char curColor = rings.charAt(i);
            char curIndex = rings.charAt(i + 1);
            int curColorIndex = switch (curColor) {
                case 'R' -> 0;
                case 'G' -> 1;
                default -> 2;
            };
            arr[curIndex - '0'][curColorIndex] = 1;
        }

        for (int i = 0; i < 10; i++) {
            boolean whetherItIsComplete = true;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0) {
                    whetherItIsComplete = false;
                    break;
                }
            }
            if (whetherItIsComplete) {
                res++;
            }
        }
        return res;
    }
}
