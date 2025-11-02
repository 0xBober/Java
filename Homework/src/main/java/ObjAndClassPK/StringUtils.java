package ObjAndClassPK;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class StringUtils {
    public Boolean isAnagram(String s1, String s2){
        s1 = s1.toLowerCase().replaceAll(" ", "");
        s2 = s2.toLowerCase().replaceAll(" ", "");

        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        for(char c : chars1){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(char c : chars2){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> SortedMap1 = new TreeMap<>(map1);
        Map<Character, Integer> SortedMap2 = new TreeMap<>(map2);

        return SortedMap1.equals(SortedMap2);
    }
}
