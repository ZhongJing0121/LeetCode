class Solution:
    """
    1678.设计 Goal 解析器
    """

    def interpret(self, command: str) -> str:
        return command.replace('()', 'o').replace('(al)', 'al')
