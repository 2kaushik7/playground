package playcom.sai.playground.linkedList;

public class LinkedListAddingTwoNumbersUsingRecursion {

	public static void main(String[] args) {
		LinkedListAddTwoListUsingRecursions stack = new LinkedListAddTwoListUsingRecursions();
		int arr1[] = { 9, 9, 9 };
		int arr2[] = { 1, 8, 9 };
		for (int i = arr1.length - 1; i >= 0; --i) {
			stack.push(arr1[i], 1);
		}
		// stack.printList(stack.getHead1());

		for (int i = arr2.length - 1; i >= 0; --i) {
			stack.push(arr2[i], 2);
		}
		// stack.printList(stack.getHead2());
		stack.addLinkedLists();

		stack.printList(stack.getResult());

	}

}

class LinkedListAddTwoListUsingRecursions {
	private Node head1;

	private Node head2;

	private Node result;

	private Node cur;

	private int carry = 0;

	static class Node {
		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
		}

	}

	public void push(int i, int list) {
		Node newNode = new Node(i);
		if (list == 1) {
			newNode.next = head1;
			head1 = newNode;
		} else if (list == 2) {
			newNode.next = head2;
			head2 = newNode;
		} else {
			newNode.next = result;
			result = newNode;
		}
	}

	public void printList(Node res) {
		while (res != null) {
			System.out.println(res.data + " ");
			res = res.next;
		}
		System.out.println();

	}

	public void addLinkedLists() {
		if (head1 == null) {
			result = head2;
			return;
		}
		if (head2 == null) {
			result = head1;
			return;
		}

		int size1 = getSize(head1);
		int size2 = getSize(head2);

		if (size1 == size2) {
			addSameSizeList(head1, head2);
		} else {
			// Always head1 must be larger
			if (size2 > size1) {
				Node temp = head1;
				head1 = head2;
				head2 = temp;
			}

			int diff = Math.abs(size2 - size1);

			Node temp = head1;

			while (diff-- >= 0) {
				cur = temp;
				temp = temp.next;
			}

			addSameSizeList(cur, head2);

			propagateCarry(head1);

		}

		if (carry > 0) {
			push(carry, 3);
		}

	}

	private void propagateCarry(Node head12) {
		if (head12 != cur) {
			propagateCarry(head12.next);
			int sum = carry + head12.data;
			carry = sum / 10;
			sum %= 10;

			push(sum, 3);
		}

	}

	private void addSameSizeList(Node n, Node m) {
		if (n == null) {
			return;
		}

		addSameSizeList(n.next, m.next);
		int sum = n.data + m.data + carry;
		carry = sum / 10;
		sum = sum % 10;

		push(sum, 3);

	}

	private int getSize(Node head) {
		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}

	public Node getResult() {
		return result;
	}

	public Node getHead1() {
		return head1;
	}

	public Node getHead2() {
		return head2;
	}

}