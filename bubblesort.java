import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	public static List<Integer> bubbleSort(List<Integer> lst){
		//go from last to second number
		for(int passes= lst.size() -1; passes != 1; --passes){
			//go from [0, passes[
			for(int i=0; i != passes; ++i){
				if(lst.get(i) > lst.get(i+1)){
					swap(lst, i, i+1);
				}
			}
		}
		return lst;
	}//end bubblesort
	
	public static void swap(List<Integer> lst, int i, int j){
		int temp = lst.get(i);
		lst.set(i, lst.get(j));
		lst.set(j, temp);
	}//end swap
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,57,75,33,6,8,56);
		System.out.println( bubbleSort(list).toString() );
	}
}
