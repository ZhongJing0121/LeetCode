package LeetCode_2000

// 2000.反转单词前缀
func reversePrefix(word string, ch byte) string {
	// 转成byte数组
	strList := []byte(word)

	// 遍历数组
	for i := 0; i < len(strList); i++ {
		// 碰到第一个
		if strList[i] == ch {
			// 反转数组
			for start, end := 0, i; start < end; start, end = start+1, end-1 {
				strList[start], strList[end] = strList[end], strList[start]
			}
			break
		}
	}
	return string(strList)
}
