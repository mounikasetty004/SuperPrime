import java.util.ArrayList;

public class Task2 {
    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,2));
        graph[2].add(new Edge(2,3));
       

    }
    static class Edge{
        
        int src;
        int dest;
        public Edge(int s,int d) {
            this.src=s;
            this.dest=d;
        }
        
    }
     public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] vis = new boolean[V];

        System.out.print("DFS Traversal starting from node 0: ");
        dfs(graph, 0, vis);
    }
    
}
