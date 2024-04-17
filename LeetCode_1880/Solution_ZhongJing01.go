// Package LeetCode_1880 检查某单词是否等于两单词之和
package LeetCode_1880

func isSumEqual(firstWord string, secondWord string, targetWord string) bool {
	return strToInt(firstWord)+strToInt(secondWord) == strToInt(targetWord)
}

func strToInt(str string) (res int) {
	for _, v := range str {
		res = res*10 + int(v-'a')
	}
	return
}
