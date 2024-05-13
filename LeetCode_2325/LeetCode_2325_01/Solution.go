package LeetCode_2325_01

// 2325.解密消息
func decodeMessage(key string, message string) string {
	// 字符映射表
	charMap := make(map[byte]byte, 27)
	charMap[' '] = ' '

	// diff：对应'a'应该加几
	for i, diff := 0, 0; i < len(key); i++ {
		if charMap[key[i]] == 0 {
			charMap[key[i]] = byte('a' + diff)
			diff += 1
		}
	}

	res := []byte(message)
	for i, c := range res {
		res[i] = charMap[c]
	}

	return string(res)
}
