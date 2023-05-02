
import org.junit.Before; 
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



/** 
* RemoveMaxEdgesKeepGraphFullyTraversable Tester. 
* 
* @author <Alexander Berg>
* @since <pre>May 2, 2023</pre> 
* @version 1.0 
*/ 
public class RemoveMaxEdgesKeepGraphFullyTraversableTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: maxNumEdgesToRemove(int n, int[][] edges) 
* 
*/




        @Test
        public void testMaxNumEdgesToRemove() {
            RemoveMaxEdgesKeepGraphFullyTraversable solution = new RemoveMaxEdgesKeepGraphFullyTraversable();

            // Test case 1: A fully connected graph without any type 3 edges.
            int n1 = 4;
            int[][] edges1 = {{1, 1, 2}, {2, 2, 3}, {3, 1, 4}, {1, 3, 4}};
            int expected1 = 4;
            assertEquals(expected1, solution.maxNumEdgesToRemove(n1, edges1));
        }
            @Test
            public void test2() {
                RemoveMaxEdgesKeepGraphFullyTraversable solution = new RemoveMaxEdgesKeepGraphFullyTraversable();
                // Test case 2: A fully connected graph with only type 3 edges.
                int n2 = 4;
                int[][] edges2 = {{3, 1, 2}, {3, 2, 3}, {3, 3, 4}};
                int expected2 = 4;
                assertEquals(expected2, solution.maxNumEdgesToRemove(n2, edges2));
            }
                @Test
                public void test3() {
                    RemoveMaxEdgesKeepGraphFullyTraversable solution = new RemoveMaxEdgesKeepGraphFullyTraversable();
                    // Test case 3: A disconnected graph with type 1 and type 2 edges.
                    int n3 = 5;
                    int[][] edges3 = {{1, 1, 2}, {2, 2, 3}, {1, 4, 5}, {2, 5, 4}, {3, 1, 5}};
                    int expected3 = 5;
                    assertEquals(expected3, solution.maxNumEdgesToRemove(n3, edges3));
                }
    @Test
    public void test4() {
        RemoveMaxEdgesKeepGraphFullyTraversable solution = new RemoveMaxEdgesKeepGraphFullyTraversable();
            // Test case 4: A graph with no edges.
            int n4 = 3;
            int[][] edges4 = {};
            int expected4 = 3;
            assertEquals(expected4, solution.maxNumEdgesToRemove(n4, edges4));
        }
    }






