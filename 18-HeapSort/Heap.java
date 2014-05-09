public class Heap{

	/*
		Node head;
		int[] data;
		int size;

		public Heap(int n){
			data = new int[n];
			size = 0;
		}

		public insert(Node n){
			Node temp = head
		}

		public Node findMax(){
			return head;
		}

		public int[] heapify(int[] data){

		}
	*/
		// Parent node: n
		// Left node: 2n
		// Right node: 2n+1

		public void heapify(int[] data){
			int count = 0;
			while (count * 2 <= data.length){
				Node head = new Node(data[count]);
				if (2 * count < data.length()){
					Node left = new Node(data[2 * count])
					head.setLeft(left);
					if (2 * count + 1 < data.length()){
						Node right = new Node(data[2 * count + 1])
						head.setRight(right);
					}
					else
						break;
				}
				count++;
			}
		}

		// period ended
		// wondering how to sift down and what helper function to use for heapify
		public void heapSort(int[] data, int length){
			int[] sort = quicksort(data);


		}

}