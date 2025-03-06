package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySolution {
  
  /**
   * Time Complexity: 
   * Space Complexity: 
   * @param nums
   * @param k
   * @return
   */
  public int[] topKFrequent(int[] nums, int k) {
    
    Map<Integer,Integer> countMap = new HashMap<>();
    for(int num : nums){
      Integer key = Integer.valueOf(num);
      countMap.putIfAbsent(key,Integer.valueOf(0));
      int count = countMap.get(key);
      countMap.put(key,Integer.valueOf(++count));
    }
    
    List<Integer> result =new ArrayList<>();
    for(Integer key: countMap.keySet()){
      Integer value = countMap.get(key);
      if(value.intValue()>=k){
        result.add(key);
      }
    }
    
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

}
