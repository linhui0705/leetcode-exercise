package P876_MiddleOfTheLinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 遍历链表，存到List，能获取到长度，然后索引取中
 *
 * @author Lin Hui
 * Created on 2019/2/13 9:18
 */
public class Solution1 {
    @Test
    public void testCase(){

    }

    public ListNode middleNode(ListNode head) {
        ListNode p=head;
        List<ListNode> list=new ArrayList<>();
        while(p!=null){
            list.add(p);
            p=p.next;
        }
        return list.get(list.size()/2);
    }
}
