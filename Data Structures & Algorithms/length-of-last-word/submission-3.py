class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.rstrip()
        stringlenth = 0
        for i in range(len(s)-1, -1 , -1):
            if s[i] == " ":
                return stringlenth
            stringlenth += 1
        return stringlenth
            