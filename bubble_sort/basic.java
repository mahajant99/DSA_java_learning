import java.util.*;
class basic{
	static void search(int[] arry){
		for(int i = 0; i < arry.length; i++){
			for(int j = 1; j < arry.length - i; j++){
				if(arry[j] < arry[j-1]){
					int temp = arry[j];
					arry [j] = arry[j-1];
					arry[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]){
		int[] num = {5,4,6,2,1};
		search(num);
		System.out.println(Arrays.toString(num));
	}
}