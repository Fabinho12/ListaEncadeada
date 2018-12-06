package List;
import Execution.Node;

public class AscendingOrderedList extends LinkedList {

	@Override
	public void insertNode(int info) {
		Node current = getHead().getNext();
		boolean inserted = false;

		if (current == null) {
			Node novo = new Node(info);
			novo.setNext(getHead().getNext());
			getHead().setNext(novo);
		} else {

			while (current != null && inserted == false) {
				if (info > current.getInfo()) {
					current = current.getNext();
					if (current == null) {
						Node novo = new Node(info);
						novo.setNext(getHead().getNext());
						getHead().setNext(novo);
						inserted = true;
					}
				} else if (current.getNext() != null && info < current.getInfo()
						&& info > current.getNext().getInfo()) {
					Node novo = new Node(info);
					novo.setNext(current.getNext());
					current.setNext(novo);
					inserted = true;
				} else {
					if (current.getNext() != null) {
						if (info < current.getNext().getInfo()) {
							current = current.getNext();
						}
					} else {
						Node novo = new Node(info);
						novo.setNext(current.getNext());
						current.setNext(novo);
						inserted = true;
					}
				}
			}
		}
	}

	@Override
	public Node searchNode(int valor) {
		Node atual = getHead().getNext();

		while (atual != null) {
			if (atual.getInfo() <= valor) {
				return atual;
			}
			atual = atual.getNext();
		}
		return null;
	}

}
