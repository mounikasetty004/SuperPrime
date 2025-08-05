import java.util.ArrayList;

public class Task1 {
public static void createGraph(ArrayList<Edge>[] graph) {
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
    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        for(int i=0;i<v;i++){
            System.out.println("node "+i+" connect to:");
            for(Edge e:graph[i]){
                System.out.print(e.dest+" ");
            }
            System.out.println();
        }
    }  
}
