// Package LeetCode_1436 旅行终点站
package LeetCode_1436

func destCity(paths [][]string) string {
	// 使用 map 存储城市，键为城市名，值为是否以起点存在过
	cityMap := make(map[string]bool)

	// 遍历路径，记录起点城市
	for _, path := range paths {
		cityMap[path[0]] = true
	}

	// 遍历路径
	for _, path := range paths {
		// 如果城市不存在于起点城市中，就是答案
		if _, ok := cityMap[path[1]]; !ok {
			return path[1]
		}
	}

	// 如果没有找到终点城市，则返回空字符串
	return ""
}
