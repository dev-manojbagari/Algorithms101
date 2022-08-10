package algorithim.array;

public class MergeSort {

    private void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }

    public void mergeSort(int[] a) {
	if (a == null || a.length <= 1)
	    return;

	mergeSort(a, 0, a.length - 1);

    }

    private void mergeSort(int[] a, int start, int end) {

	if (start >= end)
	    return;

	int mid = start + (end - start) / 2;

	mergeSort(a, start, mid);
	mergeSort(a, mid + 1, end);

	sortedMerge(a, start, mid, end);

    }

    private void sortedMerge(int[] a, int start, int mid, int end) {

	int lSize = mid - start + 1;
	int L[] = new int[lSize];
	int rSize = end - mid;
	int R[] = new int[rSize];

	for (int i = 0; i < lSize; i++) {
	    L[i] = a[start + i];
	}

	for (int i = 0; i < rSize; i++) {
	    R[i] = a[mid + 1 + i];
	}

	int i = 0;
	int j = 0;
	int k = start;

	while (i < L.length && j < R.length) {

	    if (L[i] <= R[j]) {
		a[k++] = L[i++];
	    } else {
		a[k++] = R[j++];
	    }

	}

	while (i < L.length)
	    a[k++] = L[i++];

	while (j < R.length)
	    a[k++] = R[j++];

    }

}
