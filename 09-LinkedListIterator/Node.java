import java.util.*;
import java.io.*;

public class Node {
    private E data;
    private Node<E> next;

    public Node(E s) {
	data=s;
    }
    public void setData(E s) {
	data = s;
    }
    public E getData() {
	return data;
    }
    public void setNext(Node<E> n){
	next = n;
    }
    public Node<E> getNext() {
	return next;
    }

    public E toString() {
	return "Data: "+data;// +" Next: "+next;
    }
}

