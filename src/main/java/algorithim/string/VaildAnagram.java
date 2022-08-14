package algorithim.string;

import java.util.HashMap;

public class VaildAnagram {

    public boolean vaildAnagram(String s, String t) {

	if (s.length() != t.length()) {
	    return false;
	}
	int[] map = new int[26];
	for (int i = 0; i < s.length(); i++) {
	    map[s.charAt(i) - 'a']++;
	    map[t.charAt(i) - 'a']--;
	}
	for (int i = 0; i < 26; i++) {
	    if (map[i] != 0) {
		return false;
	    }
	}
	return true;
    }

    // follow up
    public boolean vaildAnagram2(String s, String t) {

	HashMap<Character, Integer> smap = new HashMap<>();
	int sl = s.length();
	int tl = t.length();
	if (sl != tl) {
	    return false;
	}
	for (int i = 0; i < sl; i++) {
	    smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
	    smap.put(t.charAt(i), smap.getOrDefault(t.charAt(i), 0) - 1);
	}
	for (char c : smap.keySet()) {
	    if (smap.get(c) != 0) {
		return false;
	    }
	}

	return true;
    }

}
