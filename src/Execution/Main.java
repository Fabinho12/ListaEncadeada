package Execution;
import List.AscendingOrderedList;

public class Main {

	public static void main(String[] args) {
		AscendingOrderedList list = new AscendingOrderedList();

		list.insertNode(5);
		list.insertNode(4);
		list.insertNode(10);
		list.insertNode(2);
		list.insertNode(7);
		list.insertNode(25);
		list.insertNode(9);
		list.insertNode(1);
		list.insertNode(29);
		list.insertNode(15);

		System.out.println("Displaying list!");
		list.exibe();

		System.out.println("Value sought: " + list.searchNode(2).getInfo());
		System.out.println("Value sought: " + list.searchNode(22).getInfo());

		list.removeNode(4);
		list.removeNode(9);
		list.removeNode(2);
		list.removeNode(1);
		System.out.println("Displaying list!");
		list.exibe();

	}

}
