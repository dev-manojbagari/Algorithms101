package algorithim.array;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindAllSubsetsThatSumToK {

    static int n;
    static int target;
    static ArrayList<Integer> arr;
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    private static void rec(int level, int curSum, LinkedList<Integer> list) {

	if (level > n)
	    return;

	if (level == n) {
	    if (curSum == target) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.addAll(list);
		result.add(temp);
	    }
	    return;
	}

	rec(level + 1, curSum, list);

	list.addLast(arr.get(level));
	rec(level + 1, curSum + arr.get(level), list);
	list.removeLast();

	return;
    }

    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> a, int k) {
	arr = a;
	n = a.size();
	target = k;

	rec(0, 0, new LinkedList<Integer>());

	return result;
    }

}
