class Solution:
    def findLatestTime(self, s: str) -> str:
        """
        3114.替换字符可以得到的最晚时间
        """
        s_list = list(s)
        if s_list[0] == '?':
            # 如果下一位是?或者下一位比2小，最大一定是1，否则是0
            s_list[0] = '1' if s_list[1] == '?' or s_list[1] < '2' else '0'
        if s_list[1] == '?':
            s_list[1] = '1' if s_list[0] == '1' else '9'
        if s_list[3] == '?':
            s_list[3] = '5'
        if s_list[4] == '?':
            s_list[4] = '9'

        return ''.join(s_list)
