class Solution:
    def calPoints(self, operations: List[str]) -> int:
        ans = []
        for i in range(len(operations)):
            if operations[i].lstrip('-').isdigit():
                ans.append(int(operations[i]))
            elif operations[i] == "D":
                ans.append(int(ans[-1]) * 2)
            elif operations[i] == "C":
                ans.pop()
            elif operations[i] == "+":
                ans.append(int(ans[-1]) + int(ans[-2]))
            print(ans)
        return sum(ans)
        