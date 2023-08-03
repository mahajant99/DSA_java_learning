// even try own
class Even{
	public static void main(String args[]){
		int[] num = {152,154,456,22,668};
		System.out.println(findNum(num));
	}
	
	static int digits(int num){
		int count = 0;
		while(num > 0){
			count++;
			num = num / 10;
		}
		return count;
	}
	
	static boolean check(int num){
		int digits = digits(num);
		if(digits % 2 == 0){
			return true;
		}
		return false;
	}
	
	static int findNum(int[] arry){
		int count = 0;
		for (int num : arry){
			if(check(num)){
				count ++;
			}
		}
		return count;
	}
}
