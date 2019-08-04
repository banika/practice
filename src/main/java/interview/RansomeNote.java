package interview;

public class RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[128];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'A']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'A'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomeNote note = new RansomeNote();
        String ransomNote = "Hello World";
        String magazine = "hello to coderpad world";
        boolean result = note.canConstruct(ransomNote, magazine);
        System.out.println();
    }
}
