class one {
	public static void main(String args[]) {
		int[] arry = { 2, 3, 4, 5, 7, 9, 11, 15, 23, 25, 58, 69 };
		int target = 23;
		int ans = orderAgnostic(arry, target);
		System.out.print(ans);
	}

	static int orderAgnostic(int[] arry, int target) {
		int start = 0;
		int end = arry.length - 1; // find index
		
		//find whether the arry is storted in asc or dec order
		
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			// find mid
			int mid = start + (end - start) / 2;
			
			if (target == arry[mid]) {
				return mid;
			}
			
			if (isAsc]) {
				if(target < arr[mid]){
					end = mid -1;
				} else {
					start = mid +1;
				}
			}else{
				if(target > arr[mid]){
					end = mid -1;
				} else {
					start = mid +1;
				}
			}
		}
		return -1;
	}
}