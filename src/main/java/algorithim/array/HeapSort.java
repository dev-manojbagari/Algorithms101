package algorithim.array;

public class HeapSort {

    private void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }

    public void heapSort(int[] a) {

	if (a == null || a.length < 2)
	    return;
	int n = a.length;
	for (int i = n / 2 - 1; i >= 0; i--) {
	    heapify(a, i, n);
	}

	for (int i = n - 1; i > 0; i--) {
	    swap(a, 0, i);
	    heapify(a, 0, i);
	}

    }

    private void heapify(int[] a, int i, int n) {

	int left = 2 * i + 1;
	int right = 2 * i + 2;

	int maxIndex = i;

	if (left < n && a[left] > a[maxIndex]) {
	    maxIndex = left;
	}

	if (right < n && a[right] > a[maxIndex]) {
	    maxIndex = right;
	}

	if (maxIndex != i) {
	    swap(a, i, maxIndex);
	    heapify(a, maxIndex, n);
	}

    }

}
