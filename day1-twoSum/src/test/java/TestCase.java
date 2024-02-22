import java.util.Arrays;
import org.junit.Test;

public class TestCase {

  @Test
  public void testCaseOne(){
    int sums[]= new int[]{1,6,3,5};
    int result[] = MySolution.twoSum(sums,8);
    int result2[] = OptimizedSolution.twoSum(sums,8);
    
    System.out.println(Arrays.toString(result));
    System.out.println(Arrays.toString(result2));
  }

  @Test
  public void testCaseTwo(){
    int sums[]= new int[]{1,7,2,5};
    int result[] = MySolution.twoSum(sums,8);
    int result2[] = OptimizedSolution.twoSum(sums,8);

    System.out.println(Arrays.toString(result));
    System.out.println(Arrays.toString(result2));
  }


  @Test
  public void testCaseThree(){
    int sums[]= new int[]{4,4};
    int result[] = MySolution.twoSum(sums,8);
    int result2[] = OptimizedSolution.twoSum(sums,8);

    System.out.println(Arrays.toString(result));
    System.out.println(Arrays.toString(result2));
  }

}
