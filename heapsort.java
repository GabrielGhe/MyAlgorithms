import java.util.Arrays;

public class HeapSort {

	public static void heapSort(int[] lst){
		makeListIntoHeap(lst);
		makeHeapIntoSortedList(lst);
	}
	
	public static void makeListIntoHeap(int[] lst){
		//go from ]0,size] inserting into heap
		for(int i=1; i != lst.length; ++i){
			boolean goodPos = false;
			int index = i;
			//upheap while index is not root or in the right place
			
			//stop if (index == 0) or (goodPos)
			while( (index != 0) && !goodPos){
				int parent = (int)( (index - 1) / 2);
				if( lst[index] > lst[parent]){
					swap(lst, index, parent);
					index = parent;
				} else {
					goodPos = true;
				}
			}
		}
	}
	
	public static void makeHeapIntoSortedList(int[] lst){
		//remove all elements and downheap
		for(int i = lst.length-1; i != -1; --i){
			swap(lst, 0, i); //pop largest (put first element at the back)
			int index = 0;
			boolean goodPos = false;
			boolean inRange = true;
			
			while(!goodPos && inRange){
				int leftChild = (2*index) + 1;
				int rightChild = (2*index) + 2;
				int biggestChild = leftChild;
				
				if(leftChild > (i-1) ){			//index has no children
					inRange = false;
				} else if(rightChild > (i-1)){	//index has only leftChild
					biggestChild = leftChild;
				} else {						//index has both children
					biggestChild = (lst[leftChild] > lst[rightChild])? leftChild : rightChild;
				}
				
				if(inRange){
					if(lst[index] < lst[biggestChild]){
						swap(lst, index, biggestChild);
						index = biggestChild;
					} else {
						goodPos = true;
					}
				}
			}
		}
	}
	
	public static void swap(int[] lst, int i, int j){
		int temp = lst[i];
		lst[i] = lst[j];
		lst[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] list = new int[]{23,57,75,33,6,8,56};
		heapSort(list);
		System.out.println( Arrays.toString(list) );
	}
}
