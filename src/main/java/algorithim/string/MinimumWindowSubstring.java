package algorithim.string;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {

	int start = 0;

	int end;
	int[] map = new int[256];
	int counter = t.length();
	for (char c : t.toCharArray())
	    map[c]++;
	int minStart = 0;
	int minLen = Integer.MAX_VALUE;
	for (end = 0; end < s.length(); end++) {
	    if (map[s.charAt(end)] > 0)
		counter--;
	    map[s.charAt(end)]--;

	    while (counter == 0) {
		if (end - start < minLen) {
		    minStart = start;
		    minLen = end - start;
		}
		map[s.charAt(start)]++;
		if (map[s.charAt(start)] > 0)
		    counter++;
		start++;

	    }

	}

	return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen + 1);
    }

}
