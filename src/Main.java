import java.util.ArrayList;

public class Main {

    Graph g;

    public static void main(String[] args){
        new Main();
    }

    public Main(){
        create();
        print();
        Dijkstars d = new Dijkstars(g);
        d.find(g.nodes.get(0), g.nodes.get(1));
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

        Edge e = g.addEdge(new Edge(two, five, 1));
        two.addEdge(e);
        five.addEdge(e);
        e = g.addEdge(new Edge(five, six, 1));
        five.addEdge(e);
        six.addEdge(e);
        e = g.addEdge(new Edge(two, ten, 1));
        two.addEdge(e);
        ten.addEdge(e);
    }

    public void print(){
        ArrayList<Node> nodes = g.nodes;
        ArrayList<Edge> edges = g.edges;

        System.out.println("Graph with " + nodes.size() + " nodes, and " + edges.size() + " edges.");
        String allNodes = "";

        for (Node n : nodes){
            allNodes += " ";
            allNodes += n.getValue();
            allNodes += " ";
        }

        System.out.println("Nodes: " + allNodes);

        System.out.println("Connected nodes are ");

        for (Edge e : edges){
            System.out.println(e.getNodes()[0].getValue() + " <------ > " + e.getNodes()[1].getValue());
        }


    }

}
