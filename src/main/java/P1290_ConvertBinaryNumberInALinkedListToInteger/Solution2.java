package P1290_ConvertBinaryNumberInALinkedListToInteger;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019/12/25 12:30 下午
 */
public class Solution2 {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
    }
}
