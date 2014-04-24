public class Queue{
    private String[] q;
    private int head;
    private int tail;

    public Queue{
	q = new String[10];
	head = -1;
	tail = -1;
    }

    public void enqueue(String n){
	
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