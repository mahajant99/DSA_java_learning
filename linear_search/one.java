class one{
	public static void main(String agrs[]){
		int[] arry = {5,6,7,8,9,55,45,66};
		int target = 8;
		System.out.println(search(arry, target));
	}
	static int search(int[] arry, int target){
		if(arry.length == 0){
			return -1;
		}
		
		for(int i = 0; i<arry.length; i++){
			if(arry[i]==target){
				return i;
			}
		}
		
		return -1;
	}
}