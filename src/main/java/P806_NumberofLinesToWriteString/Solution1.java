package P806_NumberofLinesToWriteString;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/3/29 16:31
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] widths = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] result = numberOfLines(widths, "bbbcccdddaaa");
        System.out.println(result[0]+","+result[1]);
    }

    public static int[] numberOfLines(int[] widths, String S) {
        int lineCount = 1;
        int lineWidth = 0;
        for(char c: S.toCharArray()){
            int index = c-'a';
            int k = widths[index];
            if(k+lineWidth>100){
                lineCount++;
                lineWidth = k;
            }
            else{
                lineWidth += k;
            }
        }


        return new int[]{lineCount, lineWidth};
    }
}
