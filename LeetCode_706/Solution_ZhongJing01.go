package LeetCode_706

import (
	"container/list"
)

// 706.设计哈希映射

// 随便一个质数就可以
const base = 769

type entity struct {
	key, value int
}

type MyHashMap struct {
	data []list.List
}

func Constructor() MyHashMap {
	return MyHashMap{make([]list.List, base)}
}

// 计算数字的hash值
func (m *MyHashMap) hash(key int) int {
	return key % base
}

// Put 新增元素到hash表中
func (m *MyHashMap) Put(key int, value int) {
	// 计算hash值
	hashCode := m.hash(key)
	// 寻找该hash值的链表里是否存在这个key
	for e := m.data[hashCode].Front(); e != nil; e = e.Next() {
		// 如果存在，覆盖之前的值
		if et, ok := e.Value.(entity); ok && et.key == key {
			e.Value = entity{key, value}
			return
		}
	}
	// 如果不存在，链到该hash中链表的最后
	m.data[hashCode].PushBack(entity{key, value})
}

// Get 获取hash表中指定key的值
// 若key不存在返回 -1
func (m *MyHashMap) Get(key int) int {
	hashCode := m.hash(key)
	for e := m.data[hashCode].Front(); e != nil; e = e.Next() {
		if et, ok := e.Value.(entity); ok && et.key == key {
			return et.value
		}
	}
	return -1
}

// Remove 删除hash表中指定的key
func (m *MyHashMap) Remove(key int) {
	hashCode := m.hash(key)
	for e := m.data[hashCode].Front(); e != nil; e = e.Next() {
		if et, ok := e.Value.(entity); ok && et.key == key {
			m.data[hashCode].Remove(e)
		}
	}
}
