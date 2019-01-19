package P929_UniqueEmailAddresses;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-19 19:29
 */
public class Solution1 {
    @Test
    public void testCase() {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        Assert.assertEquals(2, numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {
        int count = -1;
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            int index = email.indexOf("@");
            String localName = email.substring(0, index);
            String address = email.substring(index, email.length());
            localName = localName.replace(".", "");
            int plusIndex = localName.indexOf("+");
            if (plusIndex != -1) {
                localName = localName.substring(0, plusIndex);
            }
            email = localName.concat(address);
            if (set.add(email)) {
                count++;
            }
        }
        return count;
    }
}
