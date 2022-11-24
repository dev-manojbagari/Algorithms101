package algorithim.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagram(String[] strs) {
	if (strs == null)
	    return null;
	List<List<String>> list = new ArrayList<>();

	if (strs.length == 1 && strs[0].length() == 0) {
	    list.add(Arrays.asList(strs[0]));
	    return list;
	}

	Map<String, List<String>> map = new HashMap<>();

	for (String str : strs) {
	    char[] charArray = str.toCharArray();
	    Arrays.sort(charArray);
	    String key = new String(charArray);
	    List<String> tempList = map.getOrDefault(key, new ArrayList<>());
	    tempList.add(str);
	    map.put(key, tempList);
	}

	map.values().forEach(i -> list.add(i));

	return list;
    }

    public List<List<String>> groupAnagram2(String[] strs) {
	if (strs == null)
	    return null;
	List<List<String>> list = new ArrayList<>();

	if (strs.length == 1 && strs[0].length() == 0) {
	    list.add(Arrays.asList(strs[0]));
	    return list;
	}

	Map<String, List<String>> map = new HashMap<>();

	for (String str : strs) {
	    char[] ca = new char[26];

	    for (int j = 0; j < str.length(); j++) {
		ca[str.charAt(j) - 'a']++;
	    }

	    String key = new String(ca);
	    List<String> tempList = map.getOrDefault(key, new ArrayList<>());
	    tempList.add(str);
	    map.put(key, tempList);
	}

	map.values().forEach(i -> list.add(i));

	return list;
    }
}
