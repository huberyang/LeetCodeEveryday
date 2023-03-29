class Solution {

  public int[] twoSum(int[] nums, int target) {
    int[] result =new int[2];
    int size= nums.length;
    for(int i =0;i<size;i++){
      for(int j =1;j<size;j++){
        if(nums[i]+nums[j] == target){
          result[0] = i;
          result[1] = j;
        }
      }
    }
    return result;

    //time complexity:
  }

  public int[] twoSumOptimazation(int[] nums, int target) {

    int[] result =new int[2];


    return result;
  }
}