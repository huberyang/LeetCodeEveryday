import java.util.List;
import org.junit.Test;
import solution.MySoulution;

public class TestCase {
  
  @Test
  public void testSolution(){
    
    String[] testDate = {"act","pots","tops","cat","stop","hat"};
    System.out.println(MySoulution.groupAnagrams(testDate));
    
  }

  @Test
  public void testSolution2(){

    String[] testDate = {"x"};
    System.out.println(MySoulution.groupAnagrams(testDate));

  }

  @Test
  public void testSolution3(){

    String[] testDate = {""};
    System.out.println(MySoulution.groupAnagrams(testDate));

  }

}
