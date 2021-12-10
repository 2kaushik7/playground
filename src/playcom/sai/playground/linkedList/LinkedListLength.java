package playcom.sai.playground.linkedList;

public class LinkedListLength {

	public static void main(String[] args) {
		SingleLinkedListForFindingLength sll = new SingleLinkedListForFindingLength();

		sll.append(new SingleLinkedListForFindingLength.Node("1"));
		sll.append(new SingleLinkedListForFindingLength.Node("1"));
		sll.append(new SingleLinkedListForFindingLength.Node("1"));

		System.out.println(sll.length());

	}
}

class SingleLinkedListForFindingLength {

	private Node head;

	public void append(Node node) {
		if (this.head == null) {
			this.head = new Node("1");
			return;
		}

		Node tail = this.head;

		while (tail.next() != null) {
			tail = tail.next();
		}

		tail.setNext(node);
	}

	public int length() {
		int length = 0;

		Node current = this.head;

		while (current != null) {
			length++;
			current = current.next();
		}

		return length;

	}

	static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
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
