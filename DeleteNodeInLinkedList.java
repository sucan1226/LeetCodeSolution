package edu.hubu.leetCode;

/**
 * LeetCode 237
 * �����ɾ��
 */

import edu.hubu.treeNode.ListNode;

public class DeleteNodeInLinkedList {
	/**
	 * һ������ɾ���б�Ľڵ���ͨ���ڵ��ǰ�ڵ�������ɾ��
	 * ���ǣ������Ҳ���ɾ���ڵ��ǰ�ڵ�
	 * ���ԣ�ͨ������ɾ���ڵ��ֵ����ָ��ֱ𻻳����ĺ�ڵ�
	 * ͨ��ɾ�����ĺ�ڵ�ʵ��ɾ������
	 * @param node
	 */
	public void deleteNode(ListNode node){
		//����ɾ���ڵ��ڵ��ֵ��ֵ����ɾ���Ľڵ�
		node.val = node.next.val;
		//����ɾ���ڵ�ĺ�ڵ�ָ���ɾ���ڵ�ĺ�ڵ�ĺ�ڵ�
		node.next = node.next.next;
	}
}
