package LeetCode_2490_01

// 作者：仲景
// 日期：2023-06-30
func isCircularSentence(sentence string) bool {
	sLen := len(sentence)

	if sentence[0] != sentence[sLen-1] {
		return false
	}

	for i := 0; i < sLen; i++ {
		if sentence[i] == ' ' && sentence[i+1] != sentence[i-1] {
			return false
		}
	}
	return true
}
