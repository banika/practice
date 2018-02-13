package algo.basics;

/**
 * Created by banindita on 5/10/2017.
 */
public class BreadthFirstSearch {
    private boolean[] visited; // Is a shortest path to this vertex known?
    private int[] edgeTo; // last vertex on known path to this vertex
    private final int s; // source
    public BreadthFirstSearch(Graph G, int s)
    {
        visited = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }
    private void bfs(Graph G, int s)
    {
        Queue<Integer> queue = new Queue<Integer>();
        visited[s] = true; // Mark the source
        queue.enqueue(s); // and put it on the queue.
        while (!queue.isEmpty())
        {
            int v = queue.dequeue(); // Remove next vertex from the queue.
            System.out.print(v+"-->");
            for (int w : G.adj(v))
                if (!visited[w]) // For every unmarked adjacent vertex,
                {
                    edgeTo[w] = v; // save last edge on a shortest path,
                    visited[w] = true; // mark it because path is known,
                    queue.enqueue(w); // and add it to the queue.
                }
        }
    }
    public boolean hasPathTo(int v)
    { return visited[v]; }
    //public Iterable<Integer> pathTo(int v)

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        //g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        BreadthFirstSearch bfs = new BreadthFirstSearch(g,2);
        bfs.bfs(g,3);
    }
}
