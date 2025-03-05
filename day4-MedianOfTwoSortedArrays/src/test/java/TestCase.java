import java.util.Arrays;
import org.junit.Test;

public class TestCase {

  @Test
  public void testBubleSort() {
    int arr[] = {1, 3, 6, 2, 4, 9, 1, 0, 5, 3};
    SortSolution.BubleSort(arr);

    System.out.println(Arrays.toString(arr));
  }

  @Test
  public void testSelectionSort() {
    int arr[] = {1, 3, 6, 2, 4, 9, 1, 0, 5, 3};
    SortSolution.SelectionSort(arr);

    System.out.println(Arrays.toString(arr));
  }

}
