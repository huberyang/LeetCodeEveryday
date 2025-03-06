package test;

import org.junit.Test;
import solution.MySolution;

public class TestCase {
  
  @Test
  public void testSolution(){
    int[] data = {0,3,2,5,4,6,1,1};
    int result = MySolution.longestConsecutive(data);

    System.out.println(result);
  }

}
