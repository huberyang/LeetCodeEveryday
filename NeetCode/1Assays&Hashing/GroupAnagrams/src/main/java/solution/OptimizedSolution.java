package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimizedSolution {


  public static List<List<String>> groupAnagrams(String[] strs) {

    Map<String, ArrayList<String>> tempMap = new HashMap<>();
    for(String data:strs){
      int[] count = new int[26];
      for (char c : data.toCharArray()) {
        count[c - 'a']++;
      }
      String sortedS = Arrays.toString(count);
      tempMap.putIfAbsent(sortedS,new ArrayList<>());
      tempMap.get(sortedS).add(data);
    }

    return new ArrayList<>(tempMap.values());
  }
}
