package algorithim.array;

public class InsertionSort {

    private void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }

    public void insertionSort(int[] a) {

	if (a == null || a.length == 0)
	    return;

	for (int i = 1; i < a.length; i++) {
	    int temp = a[i];
	    int j = i - 1;

	    while (j >= 0 && a[j] > temp) {
		a[j + 1] = a[j];
		j--;
	    }
	    a[j + 1] = temp;

	}

    }

}
