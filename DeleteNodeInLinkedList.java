package edu.hubu.leetCode;

/**
 * LeetCode 237
 * 链表的删除
 */

import edu.hubu.treeNode.ListNode;

public class DeleteNodeInLinkedList {
	/**
	 * 一般我们删除列表的节点是通过节点的前节点来进行删除
	 * 但是，这里找不到删除节点的前节点
	 * 所以，通过将待删除节点的值，和指针分别换成它的后节点
	 * 通过删除它的后节点实现删除过程
	 * @param node
	 */
	public void deleteNode(ListNode node){
		//将待删除节点后节点的值赋值给待删除的节点
		node.val = node.next.val;
		//将待删除节点的后节点指向待删除节点的后节点的后节点
		node.next = node.next.next;
	}
}
