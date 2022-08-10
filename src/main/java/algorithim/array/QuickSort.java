package algorithim.array;

// https://practice.geeksforgeeks.org/problems/quick-sort/1
public class QuickSort {

    private void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }

    public void quickSort(int[] a) {

	if (a == null || a.length < 2)
	    return;

	quickSort(a, 0, a.length - 1);

    }

    private void quickSort(int[] a, int start, int end) {

	if (start >= end)
	    return;

	int pivotIndex = partition(a, start, end);

	quickSort(a, start, pivotIndex - 1);
	quickSort(a, pivotIndex + 1, end);

    }

    private int partition(int[] a, int start, int end) {
	int pivot = a[end];

	int ptr = start;
	int curr = start;

	while (curr != end) {
	    if (a[curr] < pivot) {
		swap(a, curr, ptr);
		ptr++;
	    }
	    curr++;
	}

	swap(a, ptr, end);

	return ptr;
    }

}
