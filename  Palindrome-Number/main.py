class Solution(object):

def isPalindrome(self, x):

	x = str(x)
	
	n = x[::-1]
	
	if x == n:
	
		return True

	return False


"""

:type x: int

:rtype: bool