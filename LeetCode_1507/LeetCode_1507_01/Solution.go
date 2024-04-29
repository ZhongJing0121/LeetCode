package LeetCode_1507_01

import "strings"

// 1507.转变日期格式
func reformatDate(date string) string {
	monthMap := map[string]string{
		"Jan": "01",
		"Feb": "02",
		"Mar": "03",
		"Apr": "04",
		"May": "05",
		"Jun": "06",
		"Jul": "07",
		"Aug": "08",
		"Sep": "09",
		"Oct": "10",
		"Nov": "11",
		"Dec": "12",
	}
	splitDate := strings.Split(date, " ")
	day, month, year := splitDate[0][:len(splitDate[0])-2], monthMap[splitDate[1]], splitDate[2]
	if len(day) == 1 {
		day = "0" + day
	}
	return year + "-" + month + "-" + day
}
