class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if len(word) <= 1:
            return True
        if (word[0].islower()) or ((word[0].isupper()) and word[1].islower()):
           for i in range(1,len(word)):
               if(word[i].isupper()):
                   return False
        if word[0].isupper() and word[1].isupper():
            for i in range(1,len(word)):
                if(word[i].islower()):
                    return False
        return True

s = Solution()
f = s.detectCapitalUse("Aaasdsa")
print(f)


                    
        