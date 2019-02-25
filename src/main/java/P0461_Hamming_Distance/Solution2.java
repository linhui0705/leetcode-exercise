package P0461_Hamming_Distance;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 14:52
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(127, 0));
    }

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
