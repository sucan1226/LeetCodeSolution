
'''
Created on 2017��3��1��
@author: sucan
�鿴������ַ������е��ַ����ǲ����ڼ��̵�ͬһ��
'''

class solution(object):
    def findWords(self,words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        rs = map(set,["qwertyuiop","asdfghjkl","zxcvbnm"])
        ans = []
        for word in words:
            wset = set(word.lower())
            #判断是不是子集或者真子集
            if any(wset <= rset for rset in rs):
                ans.append(word)
                
        return ans

s = solution();
s.findWords(list(["Hello", "Alaska", "Dad", "Peace"]))