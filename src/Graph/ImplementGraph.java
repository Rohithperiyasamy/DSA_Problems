package Graph;

import java.util.ArrayList;

class Graph {
        int V;
        ArrayList<ArrayList<Integer>> graph;

        Graph(int Node) {
            V = Node;
            graph = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) {
                graph.add(new ArrayList<Integer>());
            }
        }

        void addedge(int v, int u) {
            if (v < 0 || u < 0 || v >= V || u >= V) {
                System.out.println("Invalid edge: " + v + " - " + u);
                return;
            }
            graph.get(v).add(u);
            graph.get(u).add(v);
        }

        void printGraph() {
            for (int i = 0; i < V; i++) {
                System.out.print("Node " + i + " : ");

                for (int x : graph.get(i)) {
                    System.out.print("-> " + x + " ");
                }

                System.out.println();
            }
        }
    }

    public class ImplementGraph
            {
            public static void main (String[]args){
                Graph g = new Graph(5);
                g.addedge(0, 1);
                g.addedge(2, 3);
                g.addedge(4, 2);
                g.addedge(3, 4);
                g.addedge(1, 2);
                g.addedge(1, 4);
                g.printGraph();

            }

}
