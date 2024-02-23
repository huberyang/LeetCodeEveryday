import java.util.Objects;

public class MySolution {


  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode();
    ListNode pointer = result;
    int curry = 0;
    while (Objects.nonNull(l1) || Objects.nonNull(l2) || curry == 1) {
      int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + curry;

      curry = sum / 10;

      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;

      ListNode next = new ListNode(sum % 10);
      pointer.next = next;
      pointer = pointer.next;
    }
    return result.next;
  }
}
