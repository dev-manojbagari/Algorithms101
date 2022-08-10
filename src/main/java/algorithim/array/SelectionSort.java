package algorithim.array;

public class SelectionSort {

    private void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }

    public void selectionSort(int[] a) {

	if (a == null || a.length == 0)
	    return;

	int min;
	int minIndex;
	for (int i = 0; i < a.length; i++) {
	    min = a[i];
	    minIndex = i;
	    for (int j = i + 1; j < a.length; j++) {
		if (min > a[j]) {
		    min = a[j];
		    minIndex = j;
		}

	    }
	    if (minIndex != i)
		swap(a, i, minIndex);

	}

    }

}
