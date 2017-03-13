package edu.hubu.leetCode;

/**
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
   Please note that the string does not contain any non-printable characters.
 * @author sucan
 *
 */

public class NumberOfSegmentsInAString {
	public int countSegments(String s) {
		if(s.trim().equals("")){
			return 0;
		}else{
			String[] str = s.trim().split("\\s+");
			for (String string : str) {
				System.out.println(string);
			}
			return str.length;
		}
	}
	
	public static void main(String[] args) {
		int i = new NumberOfSegmentsInAString().countSegments("                ");
		System.out.println(i);
	}
}
