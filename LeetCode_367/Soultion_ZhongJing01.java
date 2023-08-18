package LeetCode_367;

/**
 * @author ZhongJing </p>
 * @date 2023/08/18 </p>
 */
public class Soultion_ZhongJing01 {
    public boolean isPerfectSquare(int num) {
        double sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
