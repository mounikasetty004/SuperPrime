import java.util.ArrayList;

public class PrintGraph {

    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[10].add(new Edge(10,11));
        graph[11].add(new Edge(11,10));
        graph[11].add(new Edge(11,17));
        graph[11].add(new Edge(11,13));
        graph[11].add(new Edge(11,14));
        graph[11].add(new Edge(11,12));
        graph[17].add(new Edge(17,11));
        graph[13].add(new Edge(13,11));
        graph[14].add(new Edge(14,11));
        graph[12].add(new Edge(12,11));
        graph[12].add(new Edge(12,16));
        graph[12].add(new Edge(12,15));
        graph[16].add(new Edge(16,12));
        graph[15].add(new Edge(15,12));

    }
    static class Edge{
        
        int src;
        int dest;
        public Edge(int s,int d) {
            this.src=s;
            this.dest=d;
        }
        
    }
    public static void main(String[] args) {
        int v=18;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        for(int i=10;i<v;i++){
            System.out.println("node"+i+"connect to:");
            for(Edge e:graph[i]){
                System.out.print(e.dest+" ");
            }
            System.out.println();
        }
    }
}
