import bisect
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        indices = {}
        for i, char in enumerate(t):
            indices.setdefault(char,[]).append(i)
        initial_position = -1
        for char in s:
            if char not in indices:
                return False
            positions = indices[char]
            j = bisect.bisect_right(positions, initial_position)
            if j == len(positions):
                return False
            initial_position = positions[j]
        return True
            