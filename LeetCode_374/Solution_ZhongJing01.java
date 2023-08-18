package LeetCode_374;

/**
 * @author ZhongJing </p>
 * @date 2023/08/18 </p>
 */
public abstract class Solution_ZhongJing01 {
    abstract int guess(int num);

    public int guessNumber(int n) {
        // 二分
        var left = 1;
        var right = n;
        while (left <= right) {
            var mid = left + ((right - left) >> 1);
            var curRes = guess(mid);
            switch (curRes) {
                case -1:
                    right = mid - 1;
                    break;
                case 1:
                    left = mid + 1;
                    break;
                default:
                    return mid;
            }
        }
        return -1;
    }
}
