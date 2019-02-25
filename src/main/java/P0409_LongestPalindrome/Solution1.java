package P0409_LongestPalindrome;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题意是，根据所给的字符串，算出组合成回文的最大长度
 * 偶数直接累加，奇数则减1累加。若字符串计数中有奇数个的计数，最后在总数上加1
 *
 * @author Lin Hui
 * Created on 2019-1-24 22:17
 */
public class Solution1 {
    @Test
    public void testCase() {
        //7
        System.out.println(longestPalindrome("abccccdd"));
        //9
        System.out.println(longestPalindrome("aabbbcccdddd"));
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }

    public int longestPalindrome(String s) {
        int[] array = new int[52];
        int count = 0;
        boolean hasOdd = false;
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                array[c - 'a']++;
            } else {
                array[c - 'A' + 26]++;
            }
        }
        for (int i : array) {
            if (i % 2 == 0) {
                count += i;
            } else {
                hasOdd = true;
                count += i - 1;
            }
        }
        return hasOdd ? count + 1 : count;
    }
}
