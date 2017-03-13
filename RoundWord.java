package edu.hubu.leetCode;

/**
 * 
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RoundWord {
	public static String reveseString(String s){
		return s = s.substring(s.length()-1)+s.substring(0, s.length()-1);
	}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cnt=Integer.parseInt(sc.nextLine());
        Set<String> set = new HashSet<String>();
        int count = 0;
        for(int i = 0; i < cnt;i++){
        	String word = sc.nextLine();
        	if(!set.contains(word)){
        		set.add(word);
        		count++;
        		String s = RoundWord.reveseString(word);
        		while(!s.equals(word)){
        			set.add(s);
        			s = RoundWord.reveseString(s);
        		}
        	}
        }
        System.out.println(count);
    }
}
