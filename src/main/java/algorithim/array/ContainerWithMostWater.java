package algorithim.array;

public class ContainerWithMostWater {

    public int maxArea(int[] arr) {

	if (arr == null || arr.length == 1)
	    return 0;

	int maxArea = 0;

	int low = 0;
	int high = arr.length - 1;

	while (low < high) {

	    int area = Math.min(arr[low], arr[high]) * (high - low);

	    maxArea = Math.max(maxArea, area);

	    if (arr[low] < arr[high]) {
		int temp = arr[low];
		while (low < high && arr[low] <= temp)
		    low++;
	    } else if (arr[low] > arr[high]) {
		int temp = arr[high];
		while (low < high && arr[high] <= temp)
		    high--;

	    } else {
		low++;
	    }

	}
	return maxArea;

    }
}
