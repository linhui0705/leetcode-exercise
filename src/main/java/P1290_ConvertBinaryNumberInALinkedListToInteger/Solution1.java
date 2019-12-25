package P1290_ConvertBinaryNumberInALinkedListToInteger;

/**
 * Title: Solution1
 * Description:
 * 将链表上的二进制串转换为十进制数
 *
 * @author Lin Hui
 * Created on 2019/12/25 12:09 下午
 */
public class Solution1 {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        ListNode p = head;
        StringBuilder builder = new StringBuilder();
        while (p != null) {
            builder.append(p.val);
            p = p.next;
        }
        builder.reverse();

        int k = 0;
        for (char c : builder.toString().toCharArray()) {
            ans += ((int) c - '0') << k++;
        }
        return ans;
    }
}
