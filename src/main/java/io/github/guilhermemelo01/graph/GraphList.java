package io.github.guilhermemelo01.graph;

import java.util.Arrays;
import java.util.LinkedList;

public class GraphList {
    private LinkedList<Integer>[] adj;

    public GraphList(int nodes){
        this.adj = new LinkedList[nodes];
        for(int i = 0; i < nodes; i++){
            this.adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    @Override
    public String toString() {
        return "GraphList{" +
                "adj=" + Arrays.toString(adj) +
                '}';
    }

    public static void main(String[] args) {
        GraphList graphList = new GraphList(4);
        graphList.addEdge(0, 1);
        graphList.addEdge(1, 2);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 0);


        System.out.println(graphList);
    }
}
