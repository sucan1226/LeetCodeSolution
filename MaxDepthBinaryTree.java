package edu.hubu.leetCode;

/**
 * �����㷨��leetcode��û�ܳ���(��ʱ)
 */

import java.util.Queue;

import edu.hubu.treeNode.TreeNode;

public class MaxDepthBinaryTree {

	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return maxDepth(root.right) > maxDepth(root.left)?maxDepth(root.right)+1:maxDepth(root.left)+1;
	}
}
