package LeetCode_2273_01

// 2273.移除字母异位词后的结果数组
func removeAnagrams(words []string) []string {
	res := []string{words[0]}
	for _, word := range words[1:] {
		cnt := [26]int{}
		for _, ch := range word {
			cnt[ch-'a']++
		}
		for _, ch := range res[len(res)-1] {
			cnt[ch-'a']--
		}
		if cnt != [26]int{} {
			res = append(res, word)
		}
	}
	return res
}
