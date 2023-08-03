class maximum{

	public static void main(String args[]){
		int[] num = {45,65,87,55,12,88};
		System.out.println(search(num));
	}
	
    static int search(int[] arr){
		if(arr.length==0){
			return -1;
		}
		
		int max = arr[0];
		for (int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		return max;
    }
	

}