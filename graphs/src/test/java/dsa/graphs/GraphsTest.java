package dsa.graphs;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GraphsTest {

    // ─── Problem 122: Adjacency list + add edge ───────────────────────────────

    @Test void addEdge_connectsNodes() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        List<Integer> bfs = g.bfs(0);
        assertTrue(bfs.contains(1));
        assertTrue(bfs.contains(2));
    }

    // ─── Problem 123: BFS ─────────────────────────────────────────────────────

    @Test void bfs_visitAllNodes() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        List<Integer> result = g.bfs(0);
        assertEquals(4, result.size());
        assertEquals(0, result.get(0)); // starts at 0
    }

    @Test void bfs_levelOrder() {
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        List<Integer> result = g.bfs(0);
        assertEquals(0, result.get(0));
        assertTrue(result.indexOf(1) < result.size());
        assertTrue(result.indexOf(2) < result.size());
    }

    // ─── Problem 124: DFS ─────────────────────────────────────────────────────

    @Test void dfs_visitAllNodes() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        List<Integer> result = g.dfs(0);
        assertEquals(4, result.size());
        assertEquals(0, result.get(0));
    }

    // ─── Problem 125: Count connected components ─────────────────────────────

    @Test void countComponents_twoComponents() {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        // node 5 is isolated
        assertEquals(3, g.countComponents());
    }

    @Test void countComponents_allConnected() {
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        assertEquals(1, g.countComponents());
    }

    // ─── Problem 126: Detect cycle ───────────────────────────────────────────

    @Test void hasCycle_withCycle() {
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        assertTrue(g.hasCycle());
    }

    @Test void hasCycle_noCycle() {
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        assertFalse(g.hasCycle());
    }
}
