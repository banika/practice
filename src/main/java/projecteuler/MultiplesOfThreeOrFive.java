package projecteuler;

import java.util.Arrays;

public class MultiplesOfThreeOrFive {
    public int multiplesOfThreeOrFive(){
        int sum =0;
        for(int i=0;i<1000;i++){
            if(i%3==0 || i%5==0)
                sum+=i;
        }
        return sum;
    }

    public void processVarargIntegers(String label, Integer... others) {
        System.out.println(
                String.format("processing %s arguments for %s", others.length, label));
        Arrays.asList(others)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        MultiplesOfThreeOrFive m = new MultiplesOfThreeOrFive();
        m.processVarargIntegers("abcd");
        //int result = m.multiplesOfThreeOrFive();
        //System.out.println(result);
    }
}
