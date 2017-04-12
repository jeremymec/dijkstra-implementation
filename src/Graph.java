import java.util.ArrayList;

public class Graph {
    public ArrayList<Node> nodes;
    public ArrayList<Edge> edges;


    public Graph(){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addNode(Node n){
        this.nodes.add(n);
    }

    public Edge addEdge(Edge e){
        this.edges.add(e);
        return e;
    }

}
