package algorithim.array;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
	if (arr == null || arr.length == 0)
	    return;

	for (int i = 0; i < arr.length - 1; i++) {
	    for (int j = 0; j < arr.length - 1 - i; j++) {
		if (arr[j] > arr[j + 1]) {
		    swap(arr, j, j + 1);
		}
	    }
	}

    }

    private void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }

}
