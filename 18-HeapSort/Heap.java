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

		int[] data;
		int size;
		int last;

		public Heap(int x){
			data = new int[x]
			size = x;
			last = 0;
		}

		public void insert(int x){
			if (last + 1 > size)
				return;
			else{	
				last++;
				data[last] = x;
				sift();
			}
		}

		public void sift(){
			for (int x = last; x > 1; x/=2){
				int up = x/2;
				if(data[up] >= data[x])
					return;
				int old = data[x];
				data[x] = data[up];
				data[up] = old;
			}
		}

		public void push(){
			for (int x = last; x*2 <= last && data[x*2] > data[x]; x *= 2){
				if (x * 2 <= last)
					return;
				int old = data[i];
				data[x] = data[x * 2];
				data[x * 2] = old;
			} // * 2 signifies child
		}

		public int remove(){
			int temp = data[1];
			data[1] = data[last];
			last--;
			push();
			return temp;
		}

		//find median, remove median

}