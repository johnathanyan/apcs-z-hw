public class Driver {

    public static void main(String[] args) {
	Node test;

	test = new Node(19);
	System.out.println(test.getLeft());
	System.out.println(test.getRight());
	System.out.println(test.getData());
	test.setData(42);
	test.setRight((new Node(1919)));
	test.setLeft((new Node(0)));
	System.out.println(test.getLeft());
	System.out.println(test.getRight());
	System.out.println(test.getData());
    }

}
