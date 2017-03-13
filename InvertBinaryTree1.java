package edu.hubu.leetCode;

import edu.hubu.treeNode.TreeNode;

/**
 * 交换左右子树的递归实现
 * @author sucan
 *
 */

public class InvertBinaryTree1 {
	public TreeNode invertTree(TreeNode root){
		if(root == null){
			return root;
		}
		TreeNode tmpNode = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tmpNode);
		return root;
	}
}
