package playcom.sai.playground.linkedList;

public class LinkedListTest {

	public static void main(String args[]) {

		SingleLinkedList sll = new SingleLinkedList();
		sll.addNode(new SingleLinkedList.Node("1"));
		sll.addNode(new SingleLinkedList.Node("2"));
		sll.addNode(new SingleLinkedList.Node("3"));
		sll.addNode(new SingleLinkedList.Node("4"));
		sll.addNode(new SingleLinkedList.Node("5"));

		SingleLinkedList.Node current = sll.getHead();
		SingleLinkedList.Node middle = sll.getHead();
		int length = 0;

		while (current.getNext() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.getNext();
			}
			current = current.getNext();
		}

		if (length % 2 == 1) {
			middle = middle.getNext();
		}

		System.out.println("length of single linked list: " + length);
		System.out.println("\nmiddle element is " + middle);

	}

}

class SingleLinkedList {

	private Node head;
	private Node tail;

	public SingleLinkedList() {
		this.head = new Node("head raj");
		tail = head;
	}

	public Node getHead() {
		return head;
	}

	public void addNode(Node node) {
		tail.next = node;
		tail = node;
	}

	public static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String toString() {
			return this.data;
		}
	}
}
