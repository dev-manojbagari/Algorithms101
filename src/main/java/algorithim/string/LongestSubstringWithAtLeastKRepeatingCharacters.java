package algorithim.string;

public class LongestSubstringWithAtLeastKRepeatingCharacters {

    public int longestSubstringAtLeastKRepeating(String str, int k) {
	if (str == null || str.length() == 0)
	    return 0;

	int start = 0;
	int maxLength = Integer.MIN_VALUE;
	int map[] = new int[256];

	for (int end = 0; end < str.length(); end++) {
	    char key = str.charAt(end);
	    map[key]++;
	}
	start = -1;

	for (int end = 0; end < str.length(); end++) {
	    if (map[str.charAt(end)] < k) {
		maxLength = Math.max(maxLength, end - start - 1);
		start = end;
	    }
	}

	return maxLength;
    }
    
  /*  
    class Solution {
	    public int longestSubstring(String s, int k) {
	        return longestSubstringUtil(s, 0, s.length(), k);
	    }

	    int longestSubstringUtil(String s, int start, int end, int k) {
	        if (end < k) return 0;
	        int[] countMap = new int[26];
	        // update the countMap with the count of each character
	        for (int i = start; i < end; i++)
	            countMap[s.charAt(i) - 'a']++;
	        for (int mid = start; mid < end; mid++) {
	            if (countMap[s.charAt(mid) - 'a'] >= k) continue;
	            int midNext = mid + 1;
	            while (midNext < end && countMap[s.charAt(midNext) - 'a'] < k) midNext++;
	            return Math.max(longestSubstringUtil(s, start, mid, k),
	                    longestSubstringUtil(s, midNext, end, k));
	        }
	        return (end - start);
	    }

    
    class Solution {
	    public int longestSubstring(String s, int k) {
	    int []freq=new int[26];
	    char []str=s.toCharArray();
	    for(int i=0;i<str.length;++i)
	    freq[str[i]-'a']++;
	    boolean value=true;
	    int start=0;
	    int maxlen=0;
	    for(int end=0;end<str.length;++end)
	    {
	        if(freq[str[end]-'a']>0 && freq[str[end]-'a']<k)
	        {
	            String t=s.substring(start,end);
	            maxlen=Math.max(maxlen,longestSubstring(t,k));
	            start=end+1;
	            value=false;
	        }
	    }
	    if(value==true)
	    return str.length;
	    else
	    return Math.max(maxlen,longestSubstring(s.substring(start),k));
	    }
	}
		}
*/
}
