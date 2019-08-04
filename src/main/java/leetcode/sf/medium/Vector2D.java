package leetcode.sf.medium;

public class Vector2D {

    int vi, i;
    int[][] v;
    public Vector2D(int[][] v) {
        this.v = v;
        this.vi=this.i=0;
    }

    public int next() {
        if(this.hasNext()){
            int result = v[vi][i];
            i++;
            return result;
        }
        return Integer.MIN_VALUE;
    }

    public boolean hasNext() {
        if(vi>=v.length)
            return false;
        if(i>=v[vi].length){
            i = 0;
            vi++;
            return hasNext();
        }
        return true;
    }
}
