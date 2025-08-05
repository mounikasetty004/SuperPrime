import java.util.ArrayList;

public class Task3 {
    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,2));
        graph[2].add(new Edge(2,3));
    }

    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

   
    public static int count(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        vis[curr] = true;
        int count = 1; 
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                count += count(graph, e.dest, vis);
            }
        }
        return count;
    }

    
    public static boolean pathExists(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
        if (src == dest) return true;
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.dest]) {
                if (pathExists(graph, e.dest, dest, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] vis = new boolean[V];
        System.out.print("DFS Traversal starting from node 0: ");
        int reachableNodes = count(graph, 0, vis);
        System.out.println("\nNumber of nodes reachable from node 0: " + reachableNodes);

       
        vis = new boolean[V];
        int src = 0;
        int dest = 3;
        boolean exists = pathExists(graph, src, dest, vis);
        System.out.println("Is there a path from node " + src + " to node " + dest + "? " + exists);
    }
}
