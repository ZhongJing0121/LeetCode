// Package LeetCode_1773 统计匹配检索规则的物品数量
package LeetCode_1773

func countMatches(items [][]string, ruleKey string, ruleValue string) (count int) {
	var typeIndex int

	if ruleKey == "type" {
		typeIndex = 0
	} else if ruleKey == "color" {
		typeIndex = 1
	} else {
		typeIndex = 2
	}

	for _, row := range items {
		if row[typeIndex] == ruleValue {
			count++
		}
	}
	return
}
