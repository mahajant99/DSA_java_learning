// given an array numns of int, return how many of them contain an even num of digits
// steps 1. Count the no. of digits
// 2. convert num to string and get length
class even{
	public static void main(String args[]){
		int[] num = {12,345,2,6,7896,569};
		System.out.println(findNum(num));
	}
	
	static int findNum(int[] nums){
		int count = 0;
		
		for(int i = 0; i<nums.length; i++){
			if(even(nums[i])){
				count ++;
			}
		}
		return count;
	}
	
	// check whether number contains even digits or not
	static boolean even(int num){
		int digits = digits(num);
		if (digits % 2 == 0){
			return true; 
		}
		return false;
	}
	
	// count number of digits in a number
	static int digits(int num){
		int count = 0;
		
		while(num > 0){
			count ++;
			num = num / 10;
		}
		
		return count;
	}
	
}