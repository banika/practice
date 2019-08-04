package leetcode.sf.hard;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int result;
        Cache cache = new Cache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);    // evicts key 1
        result = cache.get(2);       // returns 2
        System.out.println(result);
        result = cache.get(3);       // returns 3.
        System.out.println(result);
        cache.put(4, 4);    // evicts key 1.
        result = cache.get(1);       // returns -1 (not found)
        System.out.println(result);
        result = cache.get(3);       // returns 3
        System.out.println(result);
        result = cache.get(4);       // returns 4
        System.out.println(result);
    }

    static class Cache {

        int size;

        LinkedHashMap<Integer,Integer> map;

        Cache(int size) {
            this.size = size;
            map = new LinkedHashMap<Integer,Integer>(size,0.75f, true){
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > size;
                }
            };
        }

        public int get(int key) {
            return map.getOrDefault(key,-1);
        }

        public void put(int key, int val) {
            map.put(key, val);
        }
    }
}