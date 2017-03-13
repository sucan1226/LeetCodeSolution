package edu.hubu.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a binary search tree with non-negative values, 
 * find the minimum absolute difference
 * between values of any two nodes.
 */

import edu.hubu.treeNode.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
	int minDiff = Integer.MAX_VALUE;
	TreeNode prev;
	
	public int getMinimumDifference(TreeNode root){
		inorder(root);
		return minDiff;
	}
	
	public void inorder(TreeNode root){
		if(root == null)return;
		inorder(root.left);
		System.out.println("root.left");
		if(prev != null){
			minDiff = Math.min(minDiff, Math.abs(root.val-prev.val));
		}
		prev = root;
		inorder(root.right);
		System.out.println("root.right");
	}
	
	public static void main(String[] args) {
		new MinimumAbsoluteDifferenceInBST().getMinimumDifference(new TreeNode(1));
	}
}
