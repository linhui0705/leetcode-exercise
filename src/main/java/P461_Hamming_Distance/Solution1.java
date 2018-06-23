package P461_Hamming_Distance;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 14:42
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(127,0));
    }

    public static int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            if (x % 2 != y % 2) {
                count++;
            }
            x/=2;
            y/=2;
        }
        return count;
    }
}
