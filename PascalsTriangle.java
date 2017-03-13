package edu.hubu.leetCode;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.

	For example, given numRows = 5,
	Return

	[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
	]

 */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		if(numRows < 0){
			return null;
		}
		List<List<Integer>> list = new ArrayList();
		if(numRows >= 1){
			List<Integer> data = new ArrayList();
			data.add(1);
			list.add(data);
		}
		if(numRows >= 2){
			List<Integer> data = new ArrayList();
			data.add(1);
			data.add(1);
			list.add(data);
		}
		if(numRows >= 3){
			for(int i = 3;i <= numRows;i++){
				List<Integer> data = new ArrayList<Integer>();
				List<Integer> pre = list.get(i-2);
				data.add(1);
				for(int j = 2;j < i;j++){
					data.add(pre.get(j-2)+pre.get(j-1));
				}
				data.add(1);
				list.add(data);
			}
		}
		return list;
    }
	public static void main(String[] args) {
		List list = new PascalsTriangle().generate(5);
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
