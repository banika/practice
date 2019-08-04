package leetcode.sf.medium;


public class ReverseWord {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int start=0, end =0, length = s.length();
        reverseString(start, length-1, str);

        while(end<length){
            if(str[end]!=' '){
                start = end;
                while(end<length && str[end]!=' ')
                    end++;
                end--;
                reverseString(start, end, str);
            }
            end++;
        }
        String result = new String(str);
        return result.trim();
    }

    public void reverseString(int start, int end, char[] str){
        char temp;
        while(start < end){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start ++;
            end --;
        }
    }


    public String cleanSpaces1(char[] str){
        int length = str.length;
        int start = 0, end =0;
        while(end<length){
            while(end < length && str[end]==' ')
                end++;
            while(end < length && str[end]!=' ')
                str[start++] = str[end++];
            while(end < length && str[end]==' ')
                end++;
            if(end<length)
                str[start++] = ' ';
        }

        return new String(str).substring(0, start);
    }

    public String cleanSpaces(char[] str){
        int length = str.length;

        int start =0, end = 0;
        while(end<length){
            while (end < length && str[end] == ' ')
                end++;             // skip spaces
            while (end < length && str[end] != ' ')
                str[start++] = str[end++]; // keep non spaces
            while (end < length && str[end] == ' ')
                end++;             // skip spaces
            if (end < length)
                str[start++] = ' ';                      // keep only one space
        }

        return new String(str).substring(0, start);
    }


    String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ') j++;             // skip spaces
            if (j < n) a[i++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, i);
    }

    public static void main(String[] args) {
        String input  = "  hello world!  ";
        ReverseWord reverseWord = new ReverseWord();
        reverseWord.reverseWords(input);

        char[] str = input.toCharArray();
        String output = reverseWord.cleanSpaces(str);//, str.length);

        System.out.println(output);
    }
}
