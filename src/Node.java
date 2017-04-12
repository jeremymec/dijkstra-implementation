import java.util.ArrayList;

public class Node {

    private ArrayList<Edge> edges;

    public Node(){
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge e){
        this.edges.add(e);
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }

}
