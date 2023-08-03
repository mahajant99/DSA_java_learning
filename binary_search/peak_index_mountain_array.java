// 852. Peak Index in a Mountain Array

class Solution {
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
}