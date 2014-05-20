import java.util.*;
import java.io.*;

public class Heap2{
	PriorityQueue<Integer> minheap;
	PriorityQueue<Integer> maxheap;

	public Heap2(){
		minheap = new PriorityQueue<Integer>();
		maxheap = new PriorityQueue<Integer>();
	}

	public void add(int x){
		if (maxheap.size() >= minheap.size()){
			minheap.add(x);
		}
		else{
			maxheap.add(x);
		}
	}

	public int findMedian(){
		if (((minheap.size() + maxheap.size()) % 2) == 0){
			return (maxheap.peek() + minheap.peek()) / 2;
		}
		else{
			if (minheap.size() > maxheap.size())
				return minheap.peek();
			else
				return maxheap.peek();
		}
	}

	public Integer removeMedian(){
		if (((minheap.size() + maxheap.size()) % 2) == 0){
				return (maxheap.poll() + minheap.poll()) / 2;
			}
			else{
				if (minheap.size() > maxheap.size())
					return minheap.poll();
				else
					return maxheap.poll();
			}
		}
		
}