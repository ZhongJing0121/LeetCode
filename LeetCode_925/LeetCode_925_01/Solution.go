package LeetCode_925_01

// 925.长按键入
func isLongPressedName(name string, typed string) bool {
	left, right, lenA, lenT := 0, 0, len(name), len(typed)
	for right < lenT {
		if left < lenA && name[left] == typed[right] {
			left, right = left+1, right+1
		} else if right > 0 && typed[right-1] == typed[right] {
			right++
		} else {
			return false
		}
	}
	return left == lenA
}
