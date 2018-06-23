package P476_NumberComplement;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 17:33
 */
public class Solution1 {
    public static void main(String[] args) {
        /**
         * 0 -> 1
         * 1 -> 0
         * 2 -> 10 -> 01 -> 1
         * 3 -> 11 -> 00 -> 0
         * 4 -> 100 -> 011 -> 3
         */
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
//        String s = Integer.toBinaryString(num);
//        int result = 0;
//        for (int i = 0; i < s.length(); i++) {
//            result += s.charAt(s.length()-1-i)=='0'?Math.pow(2,i):0;
//        }
//        return result;
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
