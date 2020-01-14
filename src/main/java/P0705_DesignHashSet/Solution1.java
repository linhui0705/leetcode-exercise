package P0705_DesignHashSet;

/**
 * Title: Solution1
 * Description:
 * 直接用boolean类型数组，时间复杂度O(1)，但开辟太多空间，很多空闲空间没用到。
 * 建议依据Java HashSet源码的思想编码。
 *
 * @author Lin Hui
 * Created on 2020-1-14 14:09
 */
public class Solution1 {
    class MyHashSet {
        boolean[] arr;

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            arr = new boolean[1000000];
        }

        public void add(int key) {
            arr[key] = true;
        }

        public void remove(int key) {
            arr[key] = false;
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            return arr[key];
        }
    }
}
