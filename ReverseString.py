class Solution(object):
    def reverseString(self,s):
        """
        :type s: str
        :rtype: str
        """
        array_temp = []
        for i in range(len(s)):
            array_temp.append(s[i])
        array_temp = array_temp[::-1]
        str = "".join(array_temp)
        print(str)
s = Solution();
s.reverseString("hello")  