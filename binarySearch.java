public class Q8BinarySearch {

	/**
	 * Binary Search
	 * @param list an int array
	 * @param value a int value to look for
	 * @return
	 */
	public static int binarySearch(int[] list, int value){
		int low = 0;
		int high = list.length;
		
		while(low <= high){
			int mid = (high + low)/2;
			if(list[mid] > value)
				high = mid - 1; // value is smaller than value at mid
			else if(list[mid] < value)
				low = mid + 1; // value is bigger than value at mid
			else
				return mid;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 23, 46, 52, 56, 63};
		System.out.println(binarySearch(array, 23));
	}
}
