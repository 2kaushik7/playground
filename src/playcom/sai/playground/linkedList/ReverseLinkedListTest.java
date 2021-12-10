package playcom.sai.playground.linkedList;

public class ReverseLinkedListTest {

	public static void main(String[] args) {
		SingleLinkedListForReverse sllr = new SingleLinkedListForReverse();
		sllr.append("1");
		sllr.append("2");
		sllr.append("3");
		sllr.append("4");

		sllr.ReverseIteratively();

		System.out.println("reverse using iteration: " + sllr);

		sllr.ReverseRecursiveStart();

		System.out.println("reverse using recursion: " + sllr);

	}

}

class SingleLinkedListForReverse {

	private Node head;

	public void append(String data) {
		if (head == null) {
			head = new Node(data);
			return;
		}

		tail().next = new Node(data);

	}

	public Node tail() {
		Node tail = head;

		while (tail.next != null) {
			tail = tail.next;
		}

		return tail;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node current = head;

		while (current != null) {
			sb.append(current).append("->");
			current = current.next;
		}
		if (sb.length() >= 3)
			sb.delete(sb.length() - 2, sb.length());
		return sb.toString();
	}

	public void ReverseIteratively() {
		Node forward = null;
		Node previous = null;
		Node current = head;

		while (current.next != null) {
			// Taking backup because if it gets lost we cannot traverse further after
			// replacing the head with null
			forward = current.next;

			// Making current node having the address of next
			current.next = previous;
			previous = current;

			// Going to next node
			current = forward;
		}

		head = current;
		head.next = previous;

	}

	public Node ReverseRecursively(Node node) {
		if (node.next == null) {
			return node;
		}
		Node ret = ReverseRecursively(node.next);

		node.next.next = node;
		node.next = null;

		return ret;
	}

	public void ReverseRecursiveStart() {
		head = ReverseRecursively(head);
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

		public String dataata() {
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
