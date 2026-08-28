class Solution:
    def minOperations(self, logs: List[str]) -> int:
        count = []
        for log in logs:
            if log == "./":
                continue
            elif log == "../" and len(count) != 0:
                count.pop()
            elif log != "../":
                count.append(1)
        return len(count)
                
