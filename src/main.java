import java.util.ArrayList;

public class main {

    Graph g;

    public main(){
        create();
        print();
    }

    public void create(){
        this.g = new Graph();

        Node two = new Node(2);
        Node five = new Node(5);
        Node six = new Node(6);
        Node ten = new Node(10);

        g.addNode(two);
        g.addNode(five);
        g.addNode(six);
        g.addNode(ten);

        g.addEdge(new Edge(two, five, 1));
        g.addEdge(new Edge(five, six, 1));
        g.addEdge(new Edge(two, ten, 1));
    }

    public void print(){
        ArrayList<Node> nodes = g.nodes;
        ArrayList<Edge> edges = g.edges;

        System.out.println("Graph with " + nodes.size() + " nodes, and " + edges.size() + " edges.");

    }

}
