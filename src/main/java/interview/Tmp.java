package interview;


public class Tmp {
    public double pow(double a, int b) {
        if (b == 0)
            return 1;
            // 2^3 = 2*2*2
            // 2 ^ (-3) = 1 / 2^3 = 1/8 = 1/ 2*2*2
        else if (b < 0) {
            double result = 1 / pow(a, -1 * b);
            return result;
        } else {
            double result = a;
            for (int i = 1; i < b; i++) {
                result = result * a;
            }
            return result;
        }
        // if(b%2==0)
        //    pow (a, b/2) * pow (a, b/2)
    }

    double power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }

    public static void main(String[] args) {
        Tmp tmp = new Tmp();
        double result = tmp.power(2,3);
        System.out.println(result);
        result = tmp.power(2,-3);
        System.out.println(result);
    }
}