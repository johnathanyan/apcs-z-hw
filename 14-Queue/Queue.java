public class Queue{
    private Node head;
    private Node tail;
    private int length;

    public Queue{
	head = null;
	tail = null;
	length = 0;
    }

    public void enqueue(String n){
	Node x = new Node(n);
	if (isEmpty()){
	    head = x;
	    tail = x;
	}
	else{
	    tail.setNext(x);
	    tail = tail.getNext();
	}
	length++;
    }
    
    public String dequeue(){
	if (isEmpty())
	    return null;
	else{
	    String old = head.getData();
	    head = head.getNext();
	    return old;
	}
	// removes and returns the item first
	// in the line
    }

    public boolean isEmpty(){
	return (head == null || tail == null); // added tail just in case
    }

    public Node front(){
	return head;
    }

    public String toString(){
	String ret = "";
	Node temp = head;
	while (temp != null){
	    ret = ret + temp.getData() + " --> ";
	    temp = temp.getNext();
	}
	return ret;
    }

}