package P1859_SortingTheSentence;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Title: Solution1
 * Description:
 * 给定一个乱序的句子，单词末尾有单词的正确序号，现需将这个乱序的单词复原成一个正确的句子。
 * 原本天真以为一次遍历交换顺序就都对了，后面碰到个反例导致WA了。
 * 所以还是得用优先队列来处理。
 * 但是还是跑了3ms，还是有待优化……
 *
 * @author Lin Hui
 * Created on 2022/2/22 18:31:32
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("This is a sentence", sortSentence("is2 sentence4 This1 a3"));
        Assert.assertEquals("Me Myself and I", sortSentence("Myself2 Me1 I4 and3"));
        Assert.assertEquals("fi KTFkUVVrmYMSo wXlQraUqblfhCfDLK HlRjClVtQrTFcwbx NhpQ IfTuftYVualQ",
                sortSentence("KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1"));
    }

    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        PriorityQueue<String> queue = new PriorityQueue<>(arr.length, Comparator.comparingInt(o -> (int) o.charAt(o.length() - 1)));
        queue.addAll(Arrays.asList(arr));
        StringBuilder builder = new StringBuilder();
        while (!queue.isEmpty()) {
            String str = queue.poll();
            builder.append(str, 0, str.length() - 1);
            if (!queue.isEmpty()) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
