package LeetCode_345;

/**
 * @author ZhongJing </p>
 * @date 2023/08/18 </p>
 */
public class Solution_ZhongJing01 {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        var left = 0;
        var right = charArray.length - 1;
        while (left < right) {
            while (left < right && !isVowel(charArray[left])) left++;
            while (left < right && !isVowel(charArray[right])) right--;
            if (left < right) swap(charArray, left++, right--);
        }
        return new String(charArray);
    }

    public boolean isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
