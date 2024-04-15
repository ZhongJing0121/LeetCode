package LeetCode_705

import "container/list"

// 705. 设计哈希集合

const base = 769

type MyHashSet struct {
	data []list.List
}

// 获取hash值
func (m *MyHashSet) hash(key int) int {
	return key % base
}

// Constructor 构造器
func Constructor() MyHashSet {
	return MyHashSet{make([]list.List, base)}
}

// Add 添加
func (m *MyHashSet) Add(key int) {
	if !m.Contains(key) {
		// 计算hash值
		hashCode := m.hash(key)
		m.data[hashCode].PushBack(key)
	}
}

// Remove 删除
func (m *MyHashSet) Remove(key int) {
	hashCode := m.hash(key)
	for e := m.data[hashCode].Front(); e != nil; e = e.Next() {
		if e.Value.(int) == key {
			m.data[hashCode].Remove(e)
		}
	}
}

// Contains key是否存在于hashset中
func (m *MyHashSet) Contains(key int) bool {
	hashCode := m.hash(key)
	for e := m.data[hashCode].Front(); e != nil; e = e.Next() {
		if e.Value.(int) == key {
			return true
		}
	}
	return false
}
