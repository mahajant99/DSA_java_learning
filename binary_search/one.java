class one {
	public static void main(String args[]) {
		int[] arry = { 2, 3, 4, 5, 7, 9, 11, 15, 23, 25, 58, 69 };
		int target = 23;
		int ans = search(arry, target);
		System.out.print(ans);
	}

	static int search(int[] arry, int target) {
		int start = 0;
		int end = arry.length - 1; // find index

		while (start <= end) {
			// find mid
			int mid = start + (end - start) / 2;
			if (target < arry[mid]) {
				end = mid - 1;
			} else if (target > arry[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}