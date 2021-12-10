package playcom.sai.playground.linkedList;

public class SinglyLinkedListToFindNthElementFromEndTest {

	public static void main(String[] args) {
		SinglyLinkedListToFindNthElementFromEnd sll = new SinglyLinkedListToFindNthElementFromEnd();
		sll.add(new SinglyLinkedListToFindNthElementFromEnd.Node("1"));
		sll.add(new SinglyLinkedListToFindNthElementFromEnd.Node("2"));
		sll.add(new SinglyLinkedListToFindNthElementFromEnd.Node("3"));
		sll.add(new SinglyLinkedListToFindNthElementFromEnd.Node("4"));
		sll.add(new SinglyLinkedListToFindNthElementFromEnd.Node("5"));
		sll.add(new SinglyLinkedListToFindNthElementFromEnd.Node("6"));
		System.out.println(sll.getLastNodeFromEnd(3));
		System.out.println(sll.getLastNodeFromEnd(2));
		System.out.println(sll.getLastNodeFromEnd(1));

	}

}

class SinglyLinkedListToFindNthElementFromEnd {

	private Node head;

	public String getLastNodeFromEnd(int n) {
		Node slow = head;
		Node fast = head;
		int start = 1;
		while (fast.next() != null) {
			fast = fast.next();
			start++;
			if (start > n) {
				slow = slow.next();
			}
		}
		return slow.data();
	}

	public void add(Node node) {
		if (head == null) {
			this.head = node;
			return;
		}
		Node tail = head;
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

	public int length() {
		int length = 0;
		Node current = head;
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
