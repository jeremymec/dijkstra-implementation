import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstars {
    Graph g;
    HashMap<Node, Integer> unvisited;

    public Dijkstars(Graph g){
        this.g = g;

        for(Node n : g.nodes){
            unvisited.put(n, Integer.MAX_VALUE);
        }
    }

    public Node[] find(Node start, Node end){








        return null;
    }
}
