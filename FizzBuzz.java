package edu.hubu.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n){
		List<String> ans = new ArrayList<String>();
		int count_Fizz = 0;
		int count_Buzz = 0;
		for(int i = 1;i <=n;i++){
			if(i%15 == 0){
				ans.add("FizzBuzz");
			}
			else if(i%3 == 0){
				ans.add("Fizz");
			}
			else if(i%5 ==0){
				ans.add("Buzz");
			} else{
				ans.add(""+i+"");
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		List<String> list = fb.fizzBuzz(15);
		for (String str : list) {
			System.out.println(str);
		}
	}
}
