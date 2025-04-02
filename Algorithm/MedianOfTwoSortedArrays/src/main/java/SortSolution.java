import java.util.Arrays;

public class SortSolution {

  public static int[] BubleSort(int arr[]) {
    int times = 1;
    while (times < (arr.length - 1)) {
      int length = arr.length - 1;
      for (int i = 0; i < length; i++) {
        if (arr[i] > arr[i + 1]) {
          arr[i] = arr[i] + arr[i + 1];
          arr[i + 1] = arr[i] - arr[i + 1];
          arr[i] = arr[i] - arr[i + 1];
        }
      }
      length--;
      times++;
    }
    return arr;
  }

  public static int[] SelectionSort(int arr[]) {

    int j = arr.length -1;
    int temp = 0;
    while (j >= 1) {
      int biggest = 0;
      int index = 0;
      for (int i = 0; i <= j; i++) {
        if (arr[i] > biggest) {
          biggest = arr[i];
          index = i;
        }
      }

      temp = arr[j] + arr[index];
      arr[j] = temp - arr[j];
      arr[index] = temp - arr[j];
      j--;
    }

    return arr;
  }

}
