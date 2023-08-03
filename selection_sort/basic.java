import java.util.*;
class basic{
	static void selection(int[] arry){
		for(int i = 0; i < arry.length; i++){
			int last = arry.length - i - 1;
			int maxIndex = getMaxIndex(arry, 0, last);
			swap(arry, maxIndex, last);
		}
	}
	
	static void swap(int[] arry, int first, int second){
		int temp = arry[first];
		arry[first] = arry[second];
		arry[second] = temp;
	}
	
	static int getMaxIndex(int[] arry, int start, int end){
		int max = start;
		for (int i = start; i <=end; i++){
			if(arry[max] < arry[i]){
			max = i;
			}
		}
		return max;
	}
	
	public static void main(String args[]){
		int[] num = {5,4,6,2,1};
		selection(num);
		System.out.println(Arrays.toString(num));
	}
}