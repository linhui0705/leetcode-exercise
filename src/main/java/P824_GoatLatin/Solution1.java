package P824_GoatLatin;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 字符串按要求拼接
 *
 * @author Lin Hui
 * Created on 2018/6/25 15:01
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(toGoatLatin("I speak Goat Latin"), "Imaa peaksmaaa oatGmaaaa atinLmaaaaa");
        Assert.assertEquals(toGoatLatin("The quick brown fox jumped over the lazy dog"), "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa");
    }

    public String toGoatLatin(String S) {
        String[] strList = S.split(" ");
        StringBuilder sb = new StringBuilder();

        StringBuilder maStr = new StringBuilder("ma");

        int i = 0;
        for (String s : strList) {
            maStr.append("a");

            String firstLetter = s.substring(0, 1);
            switch (firstLetter.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    sb.append(s).append(maStr);
                    break;
                default:
                    sb.append(s.substring(1, s.length())).append(firstLetter).append(maStr);
                    break;
            }

            i++;
            if (i < strList.length) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
