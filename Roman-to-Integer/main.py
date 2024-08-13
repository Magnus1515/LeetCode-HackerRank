class Solution(object):

    def romanToInt(self, s):
        dict_roman = {
            "I": 1,
            "II": 2,
            "III": 3,
            "IV": 4,
            "V": 5,
            "VI": 6,
            "VII": 7,
            "VIII": 8,
            "IX": 9,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }

        total = 0

        if len(s) <= 15:
            for i in range(len(s) - 1):
                if dict_roman[s[i]] < dict_roman[s[i + 1]]:
                    total -= dict_roman[s[i]]
                else:
                    total += dict_roman[s[i]]

            total += dict_roman[s[-1]]

        return total

        """
        :type s: str
        :rtype: int
        """

solution = Solution()
print(solution.romanToInt("XIV"))  