package edu.hubu.leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����bfs�㷨
 */

import edu.hubu.treeNode.TreeNode;

public class MaxDepthBinaryTree1 {

	public  int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root); //�����ڵ���������
		int count = 0;
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size-- > 0){
				TreeNode node = queue.poll();//�Ƴ����е�ͷ
				if(node.left != null){
					queue.offer(node.left);
				}
				if(node.right != null){
					queue.offer(node.right);
				}
			}
			count++;
		}
		return count;
	}
}
