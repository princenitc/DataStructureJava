class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        Max = -1
        for i in range(len(arr)-1, -1, -1):
           Max, arr[i] = max(arr[i], Max), Max 
        return arr