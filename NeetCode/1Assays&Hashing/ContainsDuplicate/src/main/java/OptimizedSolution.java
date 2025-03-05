import java.util.Arrays;

public class OptimizedSolution {

  /**
   * Time Complexity: O(nlogn)
   * Space Complexity: the best O(1), the worst O(n)
   * @param nums
   * @return
   */
  public static boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
      if(nums[i] == nums[i+1]){
        return true;
      }
    }
    return false;
  }
  
}
