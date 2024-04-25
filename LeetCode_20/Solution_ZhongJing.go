package main

import "errors"

// MyStack 自定义栈
type MyStack struct {
	elements []interface{}
}

// Push 入栈
func (s *MyStack) Push(element interface{}) {
	// 添加到切片的尾部
	s.elements = append(s.elements, element)
}

// Pop 出栈
func (s *MyStack) Pop() (interface{}, error) {
	if len(s.elements) == 0 {
		return '0', errors.New("栈已空")
	}

	// 获取最后一个元素，也就是栈顶
	top := s.elements[len(s.elements)-1]
	// 移除最后一个元素
	s.elements = s.elements[:len(s.elements)-1]
	return top, nil
}

// Size 获取栈中元素个数
func (s *MyStack) Size() int {
	return len(s.elements)
}

// 日期：2023-07-1769_01
// 作者：仲景
func isValid(s string) bool {
	// 定义一个栈
	stack := &MyStack{}

	// 遍历字符串
	for _, r := range s {
		if r == '(' || r == '[' || r == '{' {
			stack.Push(r)
		} else {
			pop, err := stack.Pop()
			if err != nil {
				return false
			}
			switch pop {
			case '(':
				if r != ')' {
					return false
				}
			case '[':
				if r != ']' {
					return false
				}
			case '{':
				if r != '}' {
					return false
				}
			}
		}
	}

	return stack.Size() == 0
}
