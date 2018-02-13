package leetcode.algo.array.easy;

/**
 * Created by BAnindita on 6/16/2017.
 */
public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi2("+-2"));
    }
    public static int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if(str.length() == 0) return 0;

        //2. Remove Spaces
        while(str.charAt(index) == ' ' && index < str.length())
            index ++;

        //3. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        //4. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }
    public static int myAtoi2(String str) {
        int index=0, total=0, digit=0, sign =1;
        if(str.length()==0 || str == null)
            return 0;
        while(str.charAt(index)==' ' && index < str.length()){
            index++;
        }
        if(str.charAt(index)=='+' || str.charAt(index)=='-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        while(index < str.length()){
            digit = str.charAt(index) - '0';
            if(digit<0 || digit >9)
                break;
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < digit)
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total=total*10+digit;
            index++;
        }
        return total*sign;
    }

    public static int myAtoi1(String str) {
        int total = 0, digit = 0, sign = 1, index = 0;

        //step 1: check if str is null or empty
        if(str.length()==0 || str==null)
            return 0;

        //step 2: ignore spaces
        while(str.charAt(index)==' ' && index < str.length())
            index++;

        //step 3: sign
        if(str.charAt(index)=='+' || str.charAt(index)=='-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        //step 4: convert and handle overflow
        while(index<str.length()){
            digit = str.charAt(index)-'0';
            if(digit < 0 || digit>9)
                break;
            if(Integer.MAX_VALUE/10<total || Integer.MAX_VALUE/10==total && Integer.MAX_VALUE%10<digit){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            total = 10*total + digit;
            index++;
        }

        return total*sign;
    }
}
