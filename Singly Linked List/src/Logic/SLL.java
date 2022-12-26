package Logic;

public class SLL {
	private Node head;

	public SLL() {
		this.head = null;
	}

	public boolean insertend(int data) {

		Node newnode = new Node(data);

		if (newnode == null)
			return false;

		if (head == null) {
			head = newnode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}

		last.setNext(newnode);
		return true;

	}

	public boolean insbeg(int data) {
		Node newNode = new Node(data);

		if (newNode == null)
			return false;

		if (head == null) {
			head = newNode;
			return true;
		}

		newNode.setNext(head);
		head = newNode;
		return true;

	}

	public void display() {
		Node last = head;

		while (last.getNext() != null) {
			System.out.println(last.getData() + " ");
			last = last.getNext();
		}
		System.out.println(last.getData() + " ");

	}

	public boolean inspos(int data, int position) {
		if (position < 0 || (head == null) && position > 1)
			return false;

		Node newnNode = new Node(data);

		if (newnNode == null)
			return false;

		if (position == 1) {
			newnNode.setNext(head);
			head = newnNode;
			return true;
		}

		if (position > 1) {
			Node prev = head;
			for (int i = 1; i < position - 1; i++) {
				prev = prev.getNext();
				if (prev.getNext() == null)
					return false;
			}

			newnNode.setNext(prev.getNext());
			prev.setNext(newnNode);

		}
		return true;
	}

	public boolean delpos(int position) {
		if (position < 0 || (head == null && position > 1))
			return false;

		if (position == 1) {
			head = head.getNext();
			return true;
		}

		Node prev = head;
		if (position > 1) {
			for (int i = 1; i < position - 1; i++) {
				prev = prev.getNext(); // next node of prev is deletable node
				if (prev == null)
					return false;
			}

			Node del = prev.getNext();
			prev.setNext(del.getNext());

		}
		return true;

	}

	public boolean delval(int data) {

		if (head == null)
			return false;

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node prev = head, del = head;

		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null)
				return false;
		}

		prev.setNext(del.getNext());
		return true;

	}

}
