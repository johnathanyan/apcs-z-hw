//Johnathan Yan
//Period 1

public class MyLinkedList {
    private Node head;
	private Node tail;

    public MyLinkedList() {
	head = new Node("");
	tail = head;
    }
	
	public String toString() {
		String s = "";
		Node temp = head.getNext();
		while (temp != null){
			s += temp + "\n";
			temp = temp.getNext();
		}
		return s;
		}
	
    public void add(String s) {
	Node tmp = new Node(s);
	tail.setNext(tmp);
	tail = tmp;
    }
	
	public void add(int i, String s) {
		if (i == this.length() - 1){
			this.add(s);
		}
		else{
		int count = 0;
		Node temp = head.getNext();
		while (count < i - 1){
			temp = temp.getNext();
			count++;
		}
		Node tmp = new Node(s);
		tmp.setNext(temp.getNext());
		temp.setNext(tmp);
		}
	}
	
	public String get(int i){
		int count = 0;
		Node temp = head.getNext();
		while (count < i){
			temp = temp.getNext();
			count++;
		}
		return temp.getData();
	}
	
	public String set(int i, String s){
		int count = 0;
		Node temp = head.getNext();
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
		while (count < i){
			temp = temp.getNext();
			count++;
		}
		String ret = temp.getNext().getData();
		temp.setNext(temp.getNext().getNext());
		if (i == this.length() - 1){
			tail = temp;
		}
		return ret;
	}
	
	public int find(String s){
		int count = 0;
		Node temp = head.getNext();
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
		Node temp = head.getNext();
		while (temp != null){
			count++;
			temp = temp.getNext();
		}
		return count;
	}
	
}
