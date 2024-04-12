package LeetCode_1154

import (
	"strconv"
)

// 1154.一年中的第几天
func dayOfYear(date string) int {
	// 转byte数组
	dateBytes := []byte(date)

	// 获取年月日
	year, _ := strconv.Atoi(string(dateBytes[:4]))
	month, _ := strconv.Atoi(string(dateBytes[5:7]))
	day, _ := strconv.Atoi(string(dateBytes[8:]))
	// 每个月多少天的hash表
	monthDays := []int{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}

	// 如果是闰年，2月是29天
	if (year%4 == 0 && year%100 != 0) || year%400 == 0 {
		monthDays[1] = 29
	}

	// 计算当月的天数
	res := day
	// 计算之前月的总天数
	for _, d := range monthDays[:month-1] {
		res += d
	}

	return res
}
