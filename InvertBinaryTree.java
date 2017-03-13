package edu.hubu.leetCode;

/**
 * �������������ķǵݹ�ʵ��
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
		queue.offer(root); //�����ڵ�������
		while(queue.size() > 0){
			//��ö��еĶ���Ԫ��
			TreeNode topNode = queue.peek();
			queue.poll();
			//��õ�ǰ�ڵ�����ӽڵ�
			TreeNode leftNode = topNode.left;
			//���ҽ���
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
