package edu.hubu.leetCode;

import edu.hubu.treeNode.TreeNode;

/**
 * �������������ĵݹ�ʵ��
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
