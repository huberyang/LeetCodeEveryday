import java.util.HashSet;
import java.util.Set;

public class MySolution {

  /*
    Time Complexity: O(n)
    Space Complexity: O(n)
   */
  public static boolean containsDuplicate(int[] nums) {
    int len = nums.length;
    Set numsSet = new HashSet();
    for(int i=0;i<len-1;i++){
      numsSet.add(nums[i]);
    }
    return numsSet.size() < nums.length;
  }

}
