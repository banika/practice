package leetcode.algo.hard;

public class ReachingPoints {

    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == ty) break;
            if (tx > ty) {
                if (ty > sy) tx %= ty;
                else return (tx - sx) % ty == 0;
            } else {
                if (tx > sx) ty %= tx;
                else return (ty - sy) % tx == 0;
            }
        }
        return (tx == sx && ty == sy);
    }

    public static void main(String[] args) {
        ReachingPoints rp = new ReachingPoints();
        boolean result = rp.reachingPoints(1,1,3,5);
        System.out.println(result);
    }
}
