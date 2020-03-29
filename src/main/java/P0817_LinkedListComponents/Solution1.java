package P0817_LinkedListComponents;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 给定一个链表和数组G，链表中元素唯一，数组G为链表的子集。
 * 现从链表中找到数组G不存在的元素，做为链表的断点，看这条链表能分成几段。
 *
 * @author Lin Hui
 * Created on 2020/3/29 9:38 下午
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int numComponents(ListNode head, int[] G) {
        int ans = 0;
        ListNode p = head;
        Set<Integer> set = new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        while (null != p) {
            //若当前结点p存在于子集G，而p的后置结点为空指针，或p结点的值不存在于子集G
            if (set.contains(p.val) && (null == p.next || !set.contains(p.next.val))) {
                ans++;
            }
            p = p.next;
        }
        return ans;
    }
}
