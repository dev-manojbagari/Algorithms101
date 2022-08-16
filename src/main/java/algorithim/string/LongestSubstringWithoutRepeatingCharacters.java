package algorithim.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int nonRepeatingSubstring(String str) {
	if (str == null || str.length() == 0 || "".equals(str))
	    return 0;

	int max = 0;

	Set<Character> set = new HashSet<>();

	int l = 0;
	int r = 0;
	while (r < str.length()) {

	    if (set.contains(str.charAt(r))) {

		max = Math.max(max, r - l);

		while (l < r && set.contains(str.charAt(r))) {
		    set.remove(str.charAt(l));
		    l++;
		}

	    } else {
		set.add(str.charAt(r));
		r++;
	    }

	}

	return max;
    }

    public int nonRepeatingSubstring2(String s) {
	int[] map = new int[128];
	int start = 0, end = 0, maxLen = 0, counter = 0;

	while (end < s.length()) {
	    final char c1 = s.charAt(end);
	    if (map[c1] > 0)
		counter++;
	    map[c1]++;
	    end++;

	    while (counter > 0) {
		final char c2 = s.charAt(start);
		if (map[c2] > 1)
		    counter--;
		map[c2]--;
		start++;
	    }

	    maxLen = Math.max(maxLen, end - start);
	}

	return maxLen;

    }
}