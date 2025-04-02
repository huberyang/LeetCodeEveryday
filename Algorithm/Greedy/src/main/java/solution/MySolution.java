package solution;

import java.util.List;

public class MySolution {

  /**
   * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
   *
   * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
   * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
   *
   *
   *
   * Example 1:
   *
   * Input: flowerbed = [1,0,0,0,1], n = 1
   * Output: true
   * Example 2:
   *
   * Input: flowerbed = [1,0,0,0,1], n = 2
   * Output: false
   *
   *
   * Constraints:
   *
   * 1 <= flowerbed.length <= 2 * 104
   * flowerbed[i] is 0 or 1.
   * There are no two adjacent flowers in flowerbed.
   * 0 <= n <= flowerbed.length
   */


  /**
   * Time Complexity: 
   * Space Complexity: 
   * @param strs
   * @return
   * [0,0,1,0,1]
   */
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int num = 0;
    if(flowerbed.length==1 && flowerbed[0] == 0 && n<=1){
      return true;
    }
    for(int i =0;i < flowerbed.length;i++){
      if(flowerbed[i]==0){
        if(i== 0 && flowerbed[i+1]==0){
          flowerbed[i]=1;
          ++num;
        }
        
        if (i==flowerbed.length-1 && flowerbed[i-1] == 0){
          flowerbed[i]=1;
          ++num;
        }
        
        if ((i>=1 && i!=flowerbed.length-1) && flowerbed[i-1]==0 && flowerbed[i+1]==0){
          flowerbed[i]=1;
          ++num;
        }
      }
    }
    if(num>=n){
      return true;
    }else{
      return false;
    }
  }

}
