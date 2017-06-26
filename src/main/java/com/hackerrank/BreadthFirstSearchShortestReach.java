package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class BreadthFirstSearchShortestReach {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream(new File("inputs/breadth-first-search-shortest-reach.txt")));

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int m = in.nextInt();

            Graph graph = new Graph(n);
            for (int j = 0; j < m; j++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;

                graph.addEdge(u, v);
            }
            int s = in.nextInt() - 1;
            System.out.println(shortestDistanceForAllNodes(s, n, graph));
        }
    }

    static String shortestDistanceForAllNodes(int s, int n, Graph graph) {
        StringBuilder sb = new StringBuilder();
        int[] distances = shortestDistances(s, graph);
        for (int i = 0; i < n; i++) {
            if (distances[i] != 0) {
                sb.append(distances[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private static int[] shortestDistances(int s, Graph graph) {
        Queue<Integer> queue = new LinkedList<>();
        int[] distances = new int[graph.nodes.length];
        Arrays.fill(distances, -1);

        queue.add(s);
        distances[s] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int edge : graph.getEdges(current)) {
                if (distances[edge] == -1) {
                    distances[edge] = distances[current] + 6;
                    queue.add(edge);
                }
            }
        }
        return distances;
    }

    static class Graph {
        boolean[][] nodes;

        Graph(int size) {
            nodes = new boolean[size][size];
        }

        void addEdge(int u, int v) {
            nodes[u][v] = true;
            nodes[v][u] = true;
        }

        Set<Integer> getEdges(int u) {
            Set<Integer> result = new HashSet<>();
            for (int i = 0; i < nodes.length; i++) {
                if (nodes[u][i]) {
                    result.add(i);
                }
            }
            return result;
        }
    }

}
