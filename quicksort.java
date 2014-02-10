import java.util.Random;


public class QuickSort {
	
	public static void quicksort(int[] list){
		quicksort2(list, 0, list.length - 1);
	}
	
	public static void quicksort2(int[] list, int first, int last){
		if(first < last){
			int pivot = partition(list, first, last);
			quicksort2(list, first, pivot - 1);
			quicksort2(list, pivot + 1, last);
		}
	}
	
	public static int partition(int[] list, int first, int last){
		Random r = new Random();
		int pivot = first + r.nextInt(last - first + 1);
		swap(list, pivot, last);
		for(int i=first; i < last; i++){
			if(list[i] <= list[last]){
				swap(list, i, first);
				first++;
			}
		}
		swap(list, first, last);
		return first;
	}
	
	public static void swap(int[] list, int x, int y){
		int temp = list[x];
		list[x] = list[y];
		list[y] = temp;
	}

	public static void main(String[] args) {
		int[] list = new int[]{1,4,6,7,2,3,7,8};
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		quicksort(list);
		for(int i: list) System.out.print(i + " ");
		System.out.println();
	}

}
