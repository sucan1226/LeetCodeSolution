package edu.hubu.leetCode;

/**
 *  Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

	For example, given
	s = "leetcode",
	dict = ["leet", "code"].

	Return true because "leetcode" can be segmented as "leet code".

	UPDATE (2017/1/4):
	The wordDict parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.

	Subscribe to see which companies asked this question.

 */

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	
	public boolean wordBreak(String s,List<String> wordDict){
		for(int i = 0;i < wordDict.size();i++){
			if(s.contains(wordDict.get(i))){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("xi");
		list.add("mi");
		boolean f = new WordBreak().wordBreak("leetcode", list);
		System.out.println(f);
	}
}

