package com.ss.datastructures;

/**
 * 
 * using Node
 *
 */
public class CustomStack {

	private ListNode top;
	private int size;

	class ListNode {
		int data;
		ListNode next;

		ListNode() {

		}

		ListNode(int data) {
			this.data = data;
		}
	}

	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		size++;
	}

	public void display() {
		while (top != null) {
			System.out.println(top.data);
			top = top.next;
		}
	}

}
