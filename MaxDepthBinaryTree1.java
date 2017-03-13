package edu.hubu.leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 采用bfs算法
 */

import edu.hubu.treeNode.TreeNode;

public class MaxDepthBinaryTree1 {

	public  int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root); //将根节点插入队列中
		int count = 0;
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size-- > 0){
				TreeNode node = queue.poll();//移除队列的头
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
