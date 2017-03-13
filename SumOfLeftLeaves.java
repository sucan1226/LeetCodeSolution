package edu.hubu.leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * leetCode 404
 * 求树的左叶子节点的和
 * example:
 * 3
   / \
  9  20
    /  \
   15   7

 There are two left leaves in the binary tree,
 with values 9 and 15 respectively. Return 24.
 */

import edu.hubu.treeNode.TreeNode;

public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root){
		if(root == null)return 0;
		
		int result = 0;
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		qu.offer(root);
		while(!qu.isEmpty()){
			TreeNode curr = qu.poll();
			if(curr.left != null && curr.left.left != null && curr.left.right != null){
				result += curr.left.val;
			}
			if(curr.left != null) qu.offer(curr.left);
			if(curr.right != null) qu.offer(curr.right);
		}
		return result;
	}
}
