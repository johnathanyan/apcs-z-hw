public class Heap{

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
			int temp = data[0];
			data[0] = data[last];
			last--;
			push();
			return temp;
		}

		public int findMedian(Heap a, Heap b){
			if ((a.size + b.size % 2) == 0){
				return (a[0] + b[0]) / 2
			}
			else{
				if a.size > b.size
					return a[0];
				else
					return b[0];
			}
		}

		public int removeMedian(Heap a, Heap b){
			if ((a.size + b.size % 2) == 0){
				return;
			}
			else{
				if a.size > b.size
					return a.remove();
				else
					return b.remove();
			}
		}

}