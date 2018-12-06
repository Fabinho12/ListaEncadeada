package List;
import Execution.Node;

public class LinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		head = new Node(0);
	}

	public void insertNode(int info) {
		Node current = new Node(info);
		current.setNext(head.getNext());
		head.setNext(current);
	}

	public void exibe() {
		Node current = head.getNext();

		while (current != null) {
			System.out.println(current.getInfo());
			current = current.getNext();
		}
	}

	public Node searchNode(int value) {
		Node current = head.getNext();

		while (current != null) {
			if (current.getInfo() == value) {
				return current;
			}
			current = current.getNext();
		}
		return null;
	}

	public boolean removeNode(int value) {
		Node ant = head;
		Node current = head.getNext();

		while (current != null) {
			if (current.getInfo() == value) {
				ant.setNext(current.getNext());
				return true;
			}

			ant = current;
			current = current.getNext();
		}

		return false;
	}

	public int getTamanho() {
		int tam = 0;
		Node current = head.getNext();

		while (current != null) {
			tam++;
			current = current.getNext();
		}
		return tam;
	}

}
