package LeetCode_419_01

// 419.甲板上的战舰
func countBattleships(board [][]byte) (res int) {
	for i, v1 := range board {
		for j, v2 := range v1 {
			if v2 == 'X' && (j == 0 || v1[j-1] != 'X') && (i == 0 || board[i-1][j] != 'X') {
				res++
			}
		}
	}
	return
}
