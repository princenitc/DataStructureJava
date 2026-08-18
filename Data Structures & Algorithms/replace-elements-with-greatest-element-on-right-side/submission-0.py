class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        maximum = -1
        for i in range(len(arr)-1, -1, -1):
            item = arr[i]
            arr[i] = maximum
            maximum = max(item, maximum)
        return arr