package algorithim.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] arr) {
	if (arr == null || arr.length == 0)
	    return false;

	Set<Integer> set = new HashSet<Integer>();

	for (int i = 0; i < arr.length; i++) {
	    if (set.contains(arr[i]))
		return true;
	    else
		set.add(arr[i]);

	}

	return false;
    }

}
