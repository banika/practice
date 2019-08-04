package codesignal;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    char firstNonRepeatingCharacter1(String a) {
        char found = '_';
        Map<Character,Integer> map = new HashMap<>();
        char[] strChar = a.toCharArray();
        for(char thisChar:a.toCharArray())
            map.put(thisChar, map.getOrDefault(thisChar,0)+1);
        for(int i=0;i<strChar.length;i++){
            if(map.get(strChar[i])==1)
                return strChar[i];
        }
        return found;
    }

    char firstNonRepeatingCharacter3(String s) {
        char found = '_';
        if(s==null || s!=null&&s.trim().length()==0)
            return found;
        char[] charArray = new char[26];

        char[] strChar = s.toCharArray();
        for(char thisChar:s.toCharArray()){
            charArray[thisChar-'a']++;
        }
        for(int i=0;i<strChar.length;i++){
            if(charArray[strChar[i]-'a']==1)
                return strChar[i];
        }
        return found;
    }

    char firstNotRepeatingCharacter(String s) {
        char found = '_';
        char[] charArray = new char[26];

        char[] strChar = s.toCharArray();

        for(char thisChar:s.toCharArray()){
            charArray[thisChar-'a']++;
        }
        for(int i=0;i<strChar.length;i++){
            if(charArray[strChar[i]-'a']==1)
                return strChar[i];
        }
        return found;
    }

    public int firstUniqChar(String a) {
        int found = -1;
        if(a==null || a!=null&&a.trim().length()==0)
            return found;
        char[] charArray = new char[26];

        char[] strChar = a.toCharArray();
        for(char thisChar:a.toCharArray()){
            charArray[thisChar-'a']++;
        }
        for(int i=0;i<strChar.length;i++){
            if(charArray[strChar[i]-'a']==1)
                return i;
        }
        return found;
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
        String s = "loveleetcode";
        //char place = firstNonRepeatingCharacter.firstNonRepeatingCharacter(s);
        int place = firstNonRepeatingCharacter.firstUniqChar(s);
        System.out.println(place);
    }

}
