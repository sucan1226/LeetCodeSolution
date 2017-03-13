package edu.hubu.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * leetCode 508
 * ��һ�������ҳ����ִ������������͡������;���һ������Լ����·����н�㹹�ɵ��������ܺ�
 * ����Щ�ܺ����ҳ�һ�������������Ľ��������кܶ�������Ľ����������Щ������ɵ�����
 */

import edu.hubu.treeNode.TreeNode;

public class MostFrequentSubtreeSum {
	Map<Integer,Integer> map =new HashMap<Integer,Integer>();
	public void getSumByDFS(TreeNode root){
		if(root == null)return;
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		int sum = root.val;
		System.out.println(sum);
		qu.offer(root);
		while(!qu.isEmpty()){
			int size = qu.size();
			TreeNode node = qu.poll();
			while(size-- > 0){
				if(node.left != null){
					qu.offer(node.left);
					sum += node.left.val;
					System.err.println(sum);
				}
				if(node.right != null){
					qu.offer(node.right);
					sum += node.right.val;
					System.err.println(sum);
				}
			}
		}
		System.out.println(sum);
		System.out.println("--------------");
		if(map.get(sum) != null){
			int count = map.get(sum);
			map.put(sum, count+1);
		}else{
			map.put(sum, 1);
		}
		getSumByDFS(root.left);
		getSumByDFS(root.right);
	}
	public int[] findFrequentTreeSum(TreeNode root){
		getSumByDFS(root);
		Set<Integer> set = map.keySet();
		int[] mapValue = new int[map.size()];
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		for (Integer key : set) {
			mapValue[i] = map.get(key);
			i++;
		}
		//�ҳ���������ֵ
		Arrays.sort(mapValue);
		int maxCount = mapValue[mapValue.length-1];
		for (Integer key : set) {
			if(maxCount == map.get(key)){
				list.add(key);
			}
		}
		//��listת��������
		int[] result = new int[list.size()];
		for(i = 0;i < list.size();i++){
			result[i] = list.get(i);
		}
		return result;
	}
}
