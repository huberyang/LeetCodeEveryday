package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySoulution {


  /**
   * Time Complexity: 
   * Space Complexity: 
   * @param strs
   * @return
   */
  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, ArrayList<String>> tempMap = new HashMap<>();
    for(String data:strs){
      char temp[] = data.toCharArray();
      Arrays.sort(temp);
      String sortedS = new String(temp);
      tempMap.putIfAbsent(sortedS,new ArrayList<>());
      tempMap.get(sortedS).add(data);
    }
    
    return new ArrayList<>(tempMap.values());
  }

}
