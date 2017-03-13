package edu.hubu.leetCode;

public class NimGame {
	
	public boolean canWinNim(int n){
		if(n%4 != 0){
			return true;
		}
		return false;
	}

}
