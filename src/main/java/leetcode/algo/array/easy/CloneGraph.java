package leetcode.algo.array.easy;

import java.util.*;

/**
 * Created by banindita on 5/20/2017.
 */
public class CloneGraph {
    public static void main(String[] args) {
        System.out.println();
    }

    class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    }
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        if(node==null) return null;

        LinkedList<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
        q.add(node);

        Map<Integer, UndirectedGraphNode> hm = new HashMap<Integer, UndirectedGraphNode>();
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        hm.put(node.label, newNode);

        while(!q.isEmpty()){

            UndirectedGraphNode u = q.pop();
            UndirectedGraphNode cloneU = hm.get(u.label);

            for(UndirectedGraphNode graphNode: u.neighbors){

                if(!hm.containsKey(graphNode.label)){
                    q.add(graphNode);
                    hm.put(graphNode.label, new UndirectedGraphNode(graphNode.label));
                }

                cloneU.neighbors.add(hm.get(graphNode.label));
            }
        }

        return newNode;
    }
}
