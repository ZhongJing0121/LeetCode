package LeetCode_1456_01

// 1456.定长子串中元音的最大数目
func maxVowels(s string, k int) int {
	charSet := map[byte]bool{
		'a': true,
		'e': true,
		'i': true,
		'o': true,
		'u': true,
	}
	res := 0
	for left, right, cur := 0, 0, 0; right < len(s); right++ {
		// 如果是元音字符
		if charSet[s[right]] {
			cur++
		}

		if right-left+1 == k {
			res = max(cur, res)
			if charSet[s[left]] {
				cur--
			}
			left++
		}
	}

	return res
}
