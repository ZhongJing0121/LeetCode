package LeetCode_1108

/**
 * 1108.IP 地址无效化
 */
class Solution {
    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]")
    }
}