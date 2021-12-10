package playcom.sai.playground.linkedList;

import java.util.Stack;

public class LinkedListWithStackIteration {

	static Node head1, head2, result;

	static class Node {
		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
		}
	}

	private static void push1(int i) {
		Node newNode = new Node(i);
		newNode.next = head1;
		head1 = newNode;

	}

	private static void push2(int i) {
		Node newNode = new Node(i);
		newNode.next = head2;
		head2 = newNode;

	}

	private static Node addTwoLinkedLists() {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		while (head1 != null) {
			s1.add(head1.data);
			head1 = head1.next;
		}

		while (head2 != null) {
			s2.add(head2.data);
			head2 = head2.next;
		}

		int carry = 0;
		Node result = null;

		while (!s1.isEmpty() || !s2.isEmpty()) {

			int a = 0, b = 0;

			if (!s1.isEmpty()) {
				a = s1.pop();
			}

			if (!s2.isEmpty()) {
				b = s2.pop();
			}

			int total = a + b + carry;

			carry = total / 10;

			Node temp = new Node(total % 10);

			if (result == null) {
				result = temp;
			} else {
				temp.next = result;
				result = temp;
			}
		}

		if (carry > 0) {
			Node temp = new Node(carry);
			temp.next = result;
			result = temp;
		}

		return result;
	}

	public static void main(String[] args) {
		int arr1[] = { 5, 6, 7 };
		int arr2[] = { 1, 8 };

		int size1 = 3;
		int size2 = 2;

		for (int i = size1 - 1; i >= 0; --i) {
			push1(arr1[i]);
		}

		for (int i = size2 - 1; i >= 0; --i) {
			push2(arr2[i]);
		}

		result = addTwoLinkedLists();

		printStack();

	}

	private static void printStack() {
		while (result != null) {
			System.out.println(result.data + " ");
			result = result.next;
		}

	}

}
