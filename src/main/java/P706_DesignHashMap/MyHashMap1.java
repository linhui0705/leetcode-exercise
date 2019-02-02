package P706_DesignHashMap;

/**
 * Title: MyHashMap
 * Description:
 * 第一考虑是直接开辟数组空间直接存，代价是开辟了许多不必要的空间。而且代码提交后，性能也不咋地
 * 看了别人的题解，普遍是声明一个类，运用链表结构进行存储，这样确实能大量节约内存空间
 *
 * @author Lin Hui
 * Created on 2019-2-2 10:17
 */
class MyHashMap1 {
    private int[] map = new int[1000000];

    /**
     * Initialize your data structure here.
     */
    public MyHashMap1() {
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }
        //Arrays.fill(map, -1);
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        map[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return map[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        map[key] = -1;
    }
}