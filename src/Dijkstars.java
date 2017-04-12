import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstars {
    Graph g;
    HashMap<Node, Value> nodes;
    ArrayList<Node> unvisited;
    //ArrayList<Node> visited;

    public Dijkstars(Graph g){
        this.nodes = new HashMap<>();
        this.unvisited = new ArrayList<>();

        this.g = g;

        for(Node n : g.nodes){
            nodes.put(n, new Value(Integer.MAX_VALUE, new ArrayList<Node>()));
            unvisited.add(n);
        }
    }

    public Value find(Node start, Node end){

        //Set first node
        //unvisited.remove(start);
        //visited.add(start);
        //nodes.remove(start);
        nodes.put(start, new Value(0, new ArrayList<Node>()));


        while (unvisited.size() > 0){
            //Get next node with lowest value
            int val = Integer.MAX_VALUE;
            Node current = null;

            for (Node n : unvisited){
                if (nodes.get(n).value < val){
                    val = nodes.get(n).value;
                    current = n;
                }
            }

            //Remove node from Unvisited
            unvisited.remove(current);


            //Calculate new Values
            for (Edge e : current.getEdges()){
                int weight = e.getWeight();
                Node[] nodes = e.getNodes();
                Node dest = null;

                if (nodes[0].equals(current)){
                    dest = nodes[1];
                } else if (nodes[1].equals(current)){
                    dest = nodes[0];
                }

                int value = weight + this.nodes.get(current).value;
                if (value < this.nodes.get(dest).value){
                    this.nodes.remove(dest);
                    ArrayList<Node> newPath = new ArrayList<Node>(this.nodes.get(current).path);
                    newPath.add(current);
                    this.nodes.put(dest, new Value(value, newPath));
                }
            }
        }

        return nodes.get(end);
    }
}

class Value{
    int value;
    ArrayList<Node> path;

    Value(int value, ArrayList<Node> path){
        this.value = value;
        this.path = path;
    }

    public String toString(){
        String nodes = "";
        for (Node n : path){
            nodes += " ";
            nodes += n.getValue();
            nodes += " ---> ";
        }

        return nodes;
    }
}
