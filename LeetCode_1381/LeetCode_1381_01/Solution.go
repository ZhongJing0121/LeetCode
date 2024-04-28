package LeetCode_1381_01

// 1381.设计一个支持增量操作的栈
type CustomStack struct {
	List    []int
	Top     int
	MaxSize int
}

func Constructor(maxSize int) CustomStack {
	return CustomStack{List: make([]int, maxSize), Top: 0, MaxSize: maxSize}
}

func (this *CustomStack) Push(x int) {
	// 栈不满才入栈
	if this.Top == this.MaxSize {
		this.List[this.Top] = x
		this.Top++
	}
}

func (this *CustomStack) Pop() int {
	if this.Top == 0 {
		return -1
	}
	e := this.List[this.Top-1]
	this.Top--
	return e
}

func (this *CustomStack) Increment(k int, val int) {
	for i, l := 0, min(this.Top, k); i < l; i++ {
		this.List[i] += val
	}
}
