//Johnathan Yan
//Period 1

import java.util.*;

public class QuickSort{
    
    private Random Random = new Random();

    //return piv index
    public int partition(int[] a, int l, int r){
	int indP = Random.nextInt(r-l) + l;
	int p = a[indP];
	System.out.println("PARTITION VALUE : " + p);
	int wall = 0;
	a[indP] = a[a.length-1];
	a[a.length - 1] = p;
	for (int x = 0; x < a.length; x++){
		if (a[x] < p){
			int temp = a[wall];
			a[wall] = a[x];
			a[x] = temp;
			wall++;
		}
	}
	int temp = a[wall];
	a[wall] = p;
	a[a.length - 1] = temp;
	return wall;
    }
	
	public int[] pQuickSort(int[] a){
		if (a.length <= 1)
			return a;
		else{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			int x = partition(a, 0, a.length - 1);
			int p = a[x];
			int[] R1 = pQuickSort(Arrays.copyOfRange(a,0,x));
			int[] R2 = pQuickSort(Arrays.copyOfRange(a,x+1, a.length));
			for (int y: R1)
				temp.add(y);
			temp.add(p);
			for (int y: R2)
				temp.add(y);
			int[] ret = new int[temp.size()];
			for (int y = 0; y < temp.size(); y++)
				ret[y] = temp.get(y);
			return ret;
		}
	}
		
    public static void main(String[] args){
	int[] test = {78,34,22,55,5};
	int[] testLong = {78,34,22,55,5,1385,1439,2222,1,5,7,953195,3453,2221,22014};
	QuickSort tester = new QuickSort();
	System.out.println();
	System.out.println(tester.partition(test, 0, test.length - 1));
	System.out.println(Arrays.toString(tester.pQuickSort(test)));
	System.out.println(Arrays.toString(tester.pQuickSort(testLong)));
			
    }
		
}
		
					
