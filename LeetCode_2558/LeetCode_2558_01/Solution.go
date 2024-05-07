package LeetCode_2558_01

import (
	"container/heap"
	"math"
)

type myHeap []int

func (h *myHeap) Less(i, j int) bool {
	return (*h)[i] > (*h)[j]
}

func (h *myHeap) Swap(i, j int) {
	(*h)[i], (*h)[j] = (*h)[j], (*h)[i]
}

func (h *myHeap) Len() int {
	return len(*h)
}

func (h *myHeap) Pop() (v any) {
	*h, v = (*h)[:h.Len()-1], (*h)[h.Len()-1]
	return
}

func (h *myHeap) Push(v any) {
	*h = append(*h, v.(int))
}

// 2558.从数量最多的堆取走礼物
func pickGifts(gifts []int, k int) (res int64) {
	mh := new(myHeap)
	heap.Init(mh)

	for _, gift := range gifts {
		res += int64(gift)
		heap.Push(mh, gift)
	}

	for i := 0; i < k; i++ {
		p := int64(heap.Pop(mh).(int))
		if p == 1 {
			break
		}
		p2 := int64(math.Sqrt(float64(p)))
		res -= p - p2
		heap.Push(mh, int(p2))
	}
	return
}
