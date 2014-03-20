//Johnathan Yan
//Period 1

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
	head = null;
    }
	
	public String toString() {
		String s = "";
		Node temp = head;
		while (temp != null){
			s += temp + "\n";
			temp = temp.getNext();
		}
		return s;
		}
	
    public void add(String s) {
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
    }
	
	public void add(int i, String s) {
		int count = 0;
		Node temp = head;
		while (count < i - 1){
			temp = temp.getNext();
			count++;
		}
		Node tmp = new Node(s);
		tmp.setNext(temp.getNext());
		temp.setNext(tmp);
	}
	
	public String get(int i){
		int count = 0;
		Node temp = head;
		while (count < i){
			temp = temp.getNext();
			count++;
		}
		return temp.getData();
	}
	
	public String set(int i, String s){
		int count = 0;
		Node temp = head;
		while (count < i){
			temp = temp.getNext();
			count ++;
		}
		String ret = temp.getData();
		temp.setData(s);
		return ret;
	}

	public String remove(int i) {
		int count = 0;
		Node temp = head;
		while (count < i - 1){
			temp = temp.getNext();
			count++;
		}
		String ret = temp.getNext().getData();
		temp.setNext(temp.getNext().getNext());
		return ret;
	}
	
	public int find(String s){
		int count = 0;
		Node temp = head;
		while (temp != null){
			if (temp.getData().equals(s))
				return count;
			count++;
			temp = temp.getNext();
		}
		return -1;
	}
	
	public int length(){
		int count = 0;
		Node temp = head;
		while (temp != null){
			count++;
			temp = temp.getNext();
		}
		return count;
	}
	
}
