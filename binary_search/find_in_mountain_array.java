 // 1095. Find in Mountain Array
 // incomplete
 
class Solution {
    public int search(int[] arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int firstTry = orderAgnostic(arr, target, 0, peak);
		if (firstTry != -1){
			retrun firstTry;
		}
		return orderAgnostic(arr, target, peak+1, arr.length);
		
		

    }

    public int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end){
			int mid = start + (end-start) / 2;
			if(arr[mid] > arr[mid+1]){
				// you are in dec part of arry
				// this may be the and, but at the left side
				// this is why end !=mid -1
				end = mid;
			}else{
				// you are in asc part of arry
				start = mid +1;
			}
		}
		return start; // start or end any can be returned
        
    }
	
	static int orderAgnostic(int[] arry, int target, int start, int end) {

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