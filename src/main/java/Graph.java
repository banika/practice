import java.util.*;

public class Graph {

    int V;
    LinkedList<Integer> adj[];

    public Graph(int v){
        V=v;
        adj= new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
    }

    public void topSortByBFS(){

        int[] degree = new int[V];
        for(int i=0;i<V;i++){
            LinkedList<Integer> temp = (LinkedList<Integer>) adj[i];
            for(int node:temp){
                degree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(degree[i]==0){
                queue.add(i);
            }
        }

       List<Integer> result = new LinkedList<>();
        int count = 0;

        while(!queue.isEmpty()){
            int u = queue.poll();
            result.add(u);

            for(int node: adj[u]){
                degree[node]--;
                if(degree[node]==0){
                    queue.add(node);
                }
            }
            count++;
        }

        if(count!=V){
            return;
        }

        for (int i:result){
            System.out.print(i+"    ");
        }
    }

    public void topSort(){
        Stack stack = new Stack();
        boolean[] visited = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i]){
                topSortUtil(i, visited, stack);
            }
        }

        while(!stack.empty()){
            System.out.print(stack.pop()+"    ");
        }
    }

    public void topSortUtil(int v, boolean[] visited, Stack stack){
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj[v].iterator();
        if(it.hasNext()){
            i = it.next();
            if(!visited[i]){
                topSortUtil(i, visited, stack);
            }
        }
        stack.push(v);
    }
}
