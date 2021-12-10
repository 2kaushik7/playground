package playcom.sai.playground.linkedList;

public class CircularLinkedListTest {

	public static void main(String[] args) {

		CircularLinkedList cll = new CircularLinkedList();
		cll.appendTail(new CircularLinkedList.Node("101"));
		CircularLinkedList.Node cycleNode = new CircularLinkedList.Node("cycle");
		cll.appendTail(cycleNode);
		cll.appendTail(new CircularLinkedList.Node("301"));
		cll.appendTail(new CircularLinkedList.Node("401"));
		cll.appendTail(cycleNode);

		// System.out.println(cll.toString());
		if (cll.isCyclic()) {
			System.out.println("The provided linked list is Cyclic");
		} else {
			System.out.println("The provided linked list is not cyclic");
		}

	}

}

class CircularLinkedList {
	private Node head;

	public CircularLinkedList() {
		this.head = new Node("Head node");
	}

	public void appendTail(Node node) {
		Node current = head;
		while (current.next() != null) {
			current = current.next();
		}

		current.setNext(node);
	}

	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next() != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				return true;
			}
		}

		return false;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node current = head.next();
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next();
		}

		sb.delete(sb.length() - 3, sb.length());
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
			return this.data;
		}

	}
}
