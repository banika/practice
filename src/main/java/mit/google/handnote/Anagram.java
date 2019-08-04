package mit.google.handnote;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        String ns=s.toLowerCase();
        String nt = t.toLowerCase();
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[ns.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[nt.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram("ANINDITA","anindita");
        System.out.println(result);
    }
}
