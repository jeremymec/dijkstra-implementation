import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    ArrayList<Edge> edges;


    public Graph(){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void add_node(Node n){
        this.nodes.add(n);
    }

    public void add_edge(Edge e){
        this.edges.add(e);
    }

}
