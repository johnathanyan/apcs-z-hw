public class Driver {

    public static void main(String[] args) {
	Node n1;

	n1 = new Node("Tommy");
	System.out.println(n1);
	Node n2 = new Node("Sammy");
	System.out.println(n2);
	n1.setNext(n2);
	System.out.println(n1.getNext());
	n2.setNext(  new Node("Clyde")  );
	System.out.println( n1.getNext().getNext()    );
	System.out.println( n2.getNext() );
	/* example of removing a node 
	n1.setNext(  n1.getNext().getNext()  );
	// or n1.setNext(n2.getNext());
	System.out.println("After removing second node");
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	*/
	
	System.out.println("With a loop");
	Node last = n1.getNext().getNext();
	last.setNext(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext().getNext());
    }

}
