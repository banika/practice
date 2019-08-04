package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {

    public String frequencySort(String s) {
        if(s==null || s.length()==0 || s.isEmpty())
            return s;

        Map<Character, Integer> map = new HashMap<>();

        for(Character c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();


        Map<Integer, ArrayList<Character>> freqMap = new HashMap<>();
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(freqMap.get(entry.getValue())!=null)
                ((ArrayList) freqMap.get(entry.getValue())).add(entry.getKey());
            else{
                ArrayList charList = new ArrayList();
                charList.add(entry.getKey());
                freqMap.put(entry.getValue(),charList);
                list.add(entry.getValue());
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();

        for(Integer i:list){
            ArrayList<Character> charList = freqMap.get(i);
            for(Character c : charList)
                for(int j=0;j<i;j++)
                    sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        FrequencySort fSort = new FrequencySort();
        String s = fSort.frequencySort("Aabb");
        System.out.println(s);
    }
}
