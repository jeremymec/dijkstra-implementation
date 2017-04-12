import java.util.ArrayList;

public class Node {

    private ArrayList<Edge> edges;
    private int value;

    public Node(int value){
        this.edges = new ArrayList<>();
        this.value = value;
    }

    public void addEdge(Edge e){
        this.edges.add(e);
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }

    public int getValue(){
        return this.value;
    }

}
