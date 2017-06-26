package com.hackerrank;

import com.hackerrank.BreadthFirstSearchShortestReach.Graph;
import org.junit.Test;

import static com.hackerrank.BreadthFirstSearchShortestReach.shortestDistanceForAllNodes;
import static org.assertj.core.api.Assertions.assertThat;

public class BreadthFirstSearchShortestReachTest {

    @Test
    public void shouldFindSingleJumpDistances() {
        int start = 0;
        Graph graph = new Graph(3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        assertThat(shortestDistanceForAllNodes(start, 3, graph)).isEqualTo("6 6");
    }

    @Test
    public void shouldFindLongerJumpDistances() {
        int start = 0;
        Graph graph = new Graph(3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);

        assertThat(shortestDistanceForAllNodes(start, 3, graph)).isEqualTo("6 12");
    }

    @Test
    public void shouldNotDuplicatePathLength() {
        int start = 0;
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(4, 5);

        assertThat(shortestDistanceForAllNodes(start, 6, graph)).isEqualTo("6 12 12 6 12");
    }

    @Test
    public void shouldCorrectlyHandleDetachedNode() {
        int start = 0;
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        assertThat(shortestDistanceForAllNodes(start, 4, graph)).isEqualTo("6 6 -1");
    }

}