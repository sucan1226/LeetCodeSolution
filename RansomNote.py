"""
leetCode 383
"""
from sqlalchemy.sql.expression import false
from sqlite3 import collections

class Solution(object):
    def canConstruct(self,ransomNote,magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        ransomNoteCount = collections.Counter(ransomNote)
        magazineCount = collections.Counter(magazine)
        return not ransomNoteCount - magazineCount