package LeetCode_1736_01

// 1736.替换隐藏数字得到的最晚时间
func maximumTime(time string) string {
	t := []byte(time)
	if t[0] == '?' {
		if t[1] >= '4' {
			t[0] = '1'
		} else {
			t[0] = '2'
		}
	}
	if t[1] == '?' {
		if t[0] == '0' || t[0] == '1' {
			t[1] = '9'
		} else {
			t[1] = '3'
		}
	}

	if t[3] == '?' {
		t[3] = '5'
	}

	if t[4] == '?' {
		t[4] = '9'
	}
	return string(t)
}
