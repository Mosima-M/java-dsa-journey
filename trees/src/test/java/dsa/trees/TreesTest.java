package dsa.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TreesTest {

    private BST tree;

    @BeforeEach
    void setup() {
        tree = new BST();
        // Build:    4
        //          / \
        //         2   6
        //        / \ / \
        //       1  3 5  7
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
    }

    // ─── Problem 104: Preorder ────────────────────────────────────────────────

    @Test void preorder_correctSequence() {
        List<Integer> result = tree.preorder();
        assertEquals(List.of(4,2,1,3,6,5,7), result);
    }

    // ─── Problem 105: Inorder ─────────────────────────────────────────────────

    @Test void inorder_correctSequence() {
        List<Integer> result = tree.inorder();
        assertEquals(List.of(1,2,3,4,5,6,7), result);
    }

    // ─── Problem 106: Postorder ───────────────────────────────────────────────

    @Test void postorder_correctSequence() {
        List<Integer> result = tree.postorder();
        assertEquals(List.of(1,3,2,5,7,6,4), result);
    }

    // ─── Problem 107: Level order ─────────────────────────────────────────────

    @Test void levelOrder_correctSequence() {
        List<Integer> result = tree.levelOrder();
        assertEquals(List.of(4,2,6,1,3,5,7), result);
    }

    // ─── Problem 108: Height ──────────────────────────────────────────────────

    @Test void height_balancedTree()    { assertEquals(3, tree.height()); }
    @Test void height_singleNode()      { BST t = new BST(); t.insert(1); assertEquals(1, t.height()); }

    // ─── Problem 109: Count nodes ─────────────────────────────────────────────

    @Test void countNodes_fullTree()    { assertEquals(7, tree.countNodes()); }
    @Test void countNodes_singleNode()  { BST t = new BST(); t.insert(5); assertEquals(1, t.countNodes()); }

    // ─── Problem 110: Find max ────────────────────────────────────────────────

    @Test void findMax_basic()          { assertEquals(7, tree.findMax()); }

    // ─── Problem 111: Search ──────────────────────────────────────────────────

    @Test void search_found()           { assertTrue(tree.search(3)); }
    @Test void search_notFound()        { assertFalse(tree.search(9)); }
    @Test void search_root()            { assertTrue(tree.search(4)); }

    // ─── Problem 112: Insert ──────────────────────────────────────────────────

    @Test void insert_newNode() {
        tree.insert(8);
        assertTrue(tree.search(8));
        assertEquals(8, tree.countNodes());
    }

    // ─── Problem 113: Delete ──────────────────────────────────────────────────

    @Test void delete_leafNode() {
        tree.delete(1);
        assertFalse(tree.search(1));
        assertEquals(6, tree.countNodes());
    }

    @Test void delete_nodeWithChildren() {
        tree.delete(2);
        assertFalse(tree.search(2));
        assertTrue(tree.search(1));
        assertTrue(tree.search(3));
    }
}
