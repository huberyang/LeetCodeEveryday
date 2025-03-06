package solution;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySolution {
  
  /**
   * Time Complexity: 
   * Space Complexity: 
   * @param nums
   * @return
   */
  public static int longestConsecutive(int[] nums) {
    Set<Integer> numSet =new HashSet<>(); 
    for(int num: nums){
      numSet.add(Integer.valueOf(num));
    }
    int result = 0;
    for (int num: nums) {
      if(numSet.contains(Integer.valueOf(num-1))){
        int exist = 2;
        while (numSet.contains(num+1)){
          num=++num;
          ++exist;
        }
        if(exist>result)
          result = exist;
      }
    }
    
    return result;
  }

}
