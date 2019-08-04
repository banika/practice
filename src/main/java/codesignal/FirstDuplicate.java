package codesignal;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {
    int firstDuplicate(int[] a) {
        int found = -1;
        Map<Integer,Integer> map = new HashMap<>();
        int minDuplicateNumber = -1;
        int minSecondLocation= Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            int thisInt = a[i];
            if(map.get(thisInt)!=null){
                map.put(thisInt, map.get(thisInt) + 1);
                if(i<minSecondLocation) {
                    minDuplicateNumber = thisInt;
                    found = minDuplicateNumber;
                    break;
                }
            }
            else
                map.put(thisInt, 1);
        }


        return found;
    }

    public static void main(String[] args) {
        FirstDuplicate firstDuplicate = new FirstDuplicate();
        int[] a = {2, 4, 3, 5, 1};
        int place = firstDuplicate.firstDuplicate(a);
        System.out.println(place);
    }
}
