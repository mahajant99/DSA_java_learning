class basic{
    static int linear(int[] arr, int target){
        
		if(arr.length==0){
			return -1;
		}
		
		for (int i=0; i<arr.length; i++){
			int element = arr[i];
			if(arr[i]==target){
				return i;
			}
		}
		
		return -1;
    }
	
	public static void main(String args[]){
		int[] num = {45,65,87,55,12,88};
		int target = 87;
		int ans = linear(num, target);
		System.out.println(ans);
	}
}