class Solution:

    def validWordAbbreviation(self, word: str, abbr: str) -> bool:
        l = 0
        r = 0
        while l < len(abbr) and r < len(word):
            if abbr[l].isdigit():
                num = ''
                while l < len(abbr) and abbr[l].isdigit():
                    num += abbr[l]
                    l += 1
                if num[0] != '0':
                    r += int(num)
                else:
                    return False

            elif abbr[l] == word[r]:
                l += 1
                r += 1
            else:
                return False
        if r == len(word) and l == len(abbr):
            return True
        return False
        