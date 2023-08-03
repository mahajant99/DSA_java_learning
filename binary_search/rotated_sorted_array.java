// 33. Search in Rotated Sorted Array
class rotated {

	public int search(int[] nums, int target) {
		int pivot = findPivot(nums);

		// if pivot is not found that means array is not rotated
		if (pivot == -1) {
			return binary_search(nums, target, 0, nums.length - 1);
		}

		// if pivot is found, you have 2 asc order arr
		if (nums[pivot] == target) {
			return pivot;
		}

		if (target >= nums[0]) {
			return binary_search(nums, target, 0, pivot - 1);
		}

		return binary_search(nums, target, pivot + 1, nums.length - 1);

	}

	static int binary_search(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else if (arr[mid] > arr[start]) {
				start = mid + 1;
			}
		}
		return -1;
	}
}