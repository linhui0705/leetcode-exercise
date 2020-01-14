package P0705_DesignHashSet;

import java.util.Arrays;

/**
 * Title: Solution2
 * Description:
 * 按需扩张数组空间
 *
 * @author Lin Hui
 * Created on 2020-1-14 14:31
 */
public class Solution2 {
    class MyHashSet {
        boolean[] arr;

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            arr = new boolean[10];
        }

        public void add(int key) {
            if (key >= arr.length) {
                extend(key);
            }
            arr[key] = true;
        }

        public void remove(int key) {
            if (key < arr.length) {
                arr[key] = false;
            }
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            if (key < arr.length) {
                return arr[key];
            }
            return false;
        }

        public void extend(int key) {
            arr = Arrays.copyOf(arr, key + 2);
        }
    }
}
