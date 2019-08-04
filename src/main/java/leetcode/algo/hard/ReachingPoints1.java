package leetcode.algo.hard;

/**
 * https://leetcode.com/problems/reaching-points/discuss/114856/JavaC%2B%2BPython-Modulo-from-the-End
 */
public class ReachingPoints1 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty){
        while (sx < tx && sy < ty){
            if(tx<ty)
                ty %= tx;
            else
                tx %= ty;
        }
        return (sx == tx) && (sy <=ty ) && (ty-sy) % sx == 0 ||
                (sy == ty) && (sx <=tx ) && (tx-sx) % sy == 0;
    }
}
