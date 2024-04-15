package LeetCode_2418

import "sort"

// 2418.按身高排序

func sortPeople(names []string, heights []int) []string {
	heightMap := make(map[int]int)

	// 构建身高和索引的映射，因为身高和名字一一对应
	for i, v := range heights {
		heightMap[v] = i
	}

	// 排序身高
	sort.Slice(heights, func(i, j int) bool {
		return heights[i] > heights[j]
	})

	result := make([]string, len(names))

	for i, v := range heights {
		result[i] = names[heightMap[v]]
	}

	return result
}
