package edu.hubu.leetCode;

/**
 * 交换左右子树的非递归实现
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import edu.hubu.treeNode.TreeNode;

public class InvertBinaryTree {
	
	public TreeNode invertTree(TreeNode root){
		if(root == null){
			return root;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root); //将根节点加入队列
		while(queue.size() > 0){
			//获得队列的顶部元素
			TreeNode topNode = queue.peek();
			queue.poll();
			//获得当前节点的左子节点
			TreeNode leftNode = topNode.left;
			//左右交换
			topNode.left = topNode.right;
			topNode.right = leftNode;
			if(topNode.left != null){
				queue.offer(topNode.left);
			}
			if(topNode.right != null){
				queue.offer(topNode.right);
			}
			
		}
		return root;
	}
}
