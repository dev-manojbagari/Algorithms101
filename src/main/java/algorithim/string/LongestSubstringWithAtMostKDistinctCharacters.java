package algorithim.string;

public class LongestSubstringWithAtMostKDistinctCharacters {

    public int lengthOfLongestSubstringKDistinct(String str, int k) {

	if (str == null || str.length() == 0)
	    return 0;

	int start = 0;
	int maxLength = Integer.MIN_VALUE;
	int map[] = new int[256];
	int counter = 0;
	int end;
	for (end = 0; end < str.length(); end++) {
	    map[str.charAt(end)]++;
	    if (map[str.charAt(end)] == 1)
		counter++;
	    if (counter <= k)
		maxLength = Math.max(maxLength, end - start + 1);
	    else {
		while (counter > k) {
		    if (map[str.charAt(start)] == 1)
			counter--;
		    map[str.charAt(start)]--;
		    start++;
		}
	    }

	}
	return maxLength;

    }
}
