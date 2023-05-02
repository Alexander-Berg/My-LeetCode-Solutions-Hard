import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0




public class MergeKSortedListsTest {


    @Test
    public void testMergeKLists() {
        // create some test input lists
        MergeKSortedLists.ListNode list1 = createLinkedList(new int[]{1, 4, 5});
        MergeKSortedLists.ListNode list2 = createLinkedList(new int[]{1, 3, 4});
        MergeKSortedLists.ListNode list3 = createLinkedList(new int[]{2, 6});

        // merge the lists
        MergeKSortedLists.Solution solution = new MergeKSortedLists.Solution();
        MergeKSortedLists.ListNode[] input = {list1, list2, list3};
        MergeKSortedLists.ListNode result = solution.mergeKLists(input);

        // check that the result is correct
        int[] expected = {1, 1, 2, 3, 4, 4, 5, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result.val);
            result = result.next;
        }
    }

    private MergeKSortedLists.ListNode createLinkedList(int[] values) {
        MergeKSortedLists.ListNode head = new MergeKSortedLists().new ListNode();
        MergeKSortedLists.ListNode node = head;
        for (int val : values) {
            node.next = new MergeKSortedLists().new ListNode(val);
            node = node.next;
        }
        return head.next;
    }
}
*/
