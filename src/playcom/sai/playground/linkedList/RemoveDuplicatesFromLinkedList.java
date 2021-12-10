package playcom.sai.playground.linkedList;

public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {

		SingleLinkedListRemoveDuplicates sll = new SingleLinkedListRemoveDuplicates();
		sll.add(new SingleLinkedListRemoveDuplicates.Node("1"));
		sll.add(new SingleLinkedListRemoveDuplicates.Node("2"));
		sll.add(new SingleLinkedListRemoveDuplicates.Node("2"));
		sll.add(new SingleLinkedListRemoveDuplicates.Node("3"));
		sll.add(new SingleLinkedListRemoveDuplicates.Node("4"));
		sll.add(new SingleLinkedListRemoveDuplicates.Node("4"));
		System.out.println("Linkedlist with duplicates: " + sll);
		sll.removeDuplicates();
		System.out.println("Linkedlist without duplicates: " + sll);

	}
}

class SingleLinkedListRemoveDuplicates {

	private Node head;

	public SingleLinkedListRemoveDuplicates() {
		// this.head = new Node("head");
	}

	public void removeDuplicates() {
		Node p1 = null, p2 = null;
		p1 = head;
		// Basically we take two pointers and point them to head initially , we run two
		// loops. Pick one element compare each element to the other elements in the
		// list. If equal , remove the connection and place next to element in the next
		// variable of the node
		while (p1 != null && p1.next() != null) {
			p2 = p1;
			while (p2.next() != null) {
				p2 = p2.next();
				if (p2.data.equals(p1.data)) {
					p1.next = p2.next();
					System.gc();
				}

			}
			p1 = p1.next();
		}

	}

	public void add(Node node) {
		if (this.head == null) {
			this.head = node;
			return;
		}
		Node tail = this.head;
		while (tail.next() != null) {
			tail = tail.next();
		}

		tail.setNext(node);

	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node current = head;
		while (current != null) {
			sb.append(current).append("->");
			current = current.next();
		}
		sb.delete(sb.length() - 2, sb.length());
		return sb.toString();
	}

	static class Node {
		private Node next;
		private String data;

		public Node(String str) {
			this.data = str;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String data() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String toString() {
			return data;
		}
	}
}
