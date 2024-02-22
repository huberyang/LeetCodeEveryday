import java.util.HashMap;
import java.util.Map;

public class OptimizedSolution {

  /*
  Time Complexity: O(n)
 */
  public static int[] twoSum(int[] nums, int target) {
    int result[] =new int[2];
    Map<Integer, Integer> dataMap =new HashMap();

    for(int i=0;i<nums.length;i++){
      int rest = target-nums[i];
      if(dataMap.containsKey(rest)){
        result[0] = dataMap.get(rest);
        result[1] = i;
      }
      dataMap.put(nums[i],i);
    }
    return result;
  }

}
