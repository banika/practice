package leetcode.sf.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SkylineProblem {

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> height = new ArrayList<>();
        // Trick to put negative height for the left edge
        for(int[] b:buildings) {
            height.add(Arrays.asList(b[0], -b[2]));
            height.add(Arrays.asList(b[1], b[2]));
        }
        Collections.sort(height, (a, b) -> {
            if(a.get(0)!=b.get(0))
                return (int)a.get(0)-(int)b.get(0);
            return (int)a.get(1)-(int)b.get(1);
        });

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        pq.offer(0);
        int prev = 0;
        for(List h:height) {
            if((int)h.get(1) < 0)
                pq.offer(-(int)h.get(1));
            else
                pq.remove((int)h.get(1));
            int cur = pq.peek();
            if(prev != cur) {
                result.add(Arrays.asList((Integer)h.get(0), cur));
                prev = cur;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[][] buildings = {
                                {2, 9, 10},
                                {3, 7, 15},
                                {5, 12, 12},
                                {15, 20, 10},
                                {19, 24, 8}
                            };
        SkylineProblem skylineProblem = new SkylineProblem();
        List<List<Integer>> result = skylineProblem.getSkyline(buildings);
        //for()
        System.out.println(result);
    }
}
