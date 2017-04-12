

public class Edge {

    private Node first;
    private Node second;

    private int weight;

    public Edge(Node first, Node second, int weight){
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    public Node[] getNodes(){
        Node[] nodes = {this.first, this.second};
        return nodes;
    }

    public int getWeight(){
        return this.weight;
    }

}
