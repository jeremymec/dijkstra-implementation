import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dijkstars {
    Graph g;
    HashMap<Node, Value> nodes;
    ArrayList<Node> unvisited;
    //ArrayList<Node> visited;

    public Dijkstars(Graph g){
        this.g = g;

        for(Node n : g.nodes){
            nodes.put(n, new Value(Integer.MAX_VALUE, null));
            unvisited.add(n);
        }
    }

    public Node[] find(Node start, Node end){

        //Set first node
        unvisited.remove(start);
        //visited.add(start);
        nodes.remove(start);
        nodes.put(start, new Value(0, null));


        while (unvisited.size() > 0){
            //Get next node with lowest value
            int val = Integer.MIN_VALUE;
            Node current = start;

            for (Node n : unvisited){
                if (val > nodes.get(n).value){
                    val = nodes.get(n).value;
                    current = n;
                }
            }

            //Remove node from Unvisited
            unvisited.remove(current);


        }



        return null;
    }
}

class Value{
    int value;
    Node[] path;

    Value(int value, Node[] path){
        this.value = value;
        this.path = path;
    }
}
