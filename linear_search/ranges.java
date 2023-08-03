class basic{

	public static void main(String args[]){
		int[] num = {45,65,87,55,12,88};
		int target = 87;
		int ans = linear(num, target, 3, 5);
		System.out.println(ans);
	}
	
    static int linear(int[] arr, int target, int start, int end){
        
		if(arr.length==0){
			return -1;
		}
		
		for (int i=start; i<=end; i++){
			int element = arr[i];
			if(arr[i]==target){
				return i;
			}
		}
		
		return -1;
    }
	

}