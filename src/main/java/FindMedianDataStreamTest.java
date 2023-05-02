import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
*/

 public class FindMedianDataStreamTest {
     @Before
     public void before() throws Exception {
     }

     @After
     public void after() throws Exception {
     }

 @Test
 public void testFindMedianEmptyList() {
 FindMedianDataStream.MedianFinder mf = new FindMedianDataStream.MedianFinder();
 assertEquals(0.0, mf.findMedian(), 0.0001);
 }

 @Test
 public void testFindMedianSingleElement() {
 FindMedianDataStream.MedianFinder mf = new FindMedianDataStream.MedianFinder();
 mf.addNum(5);
 assertEquals(5.0, mf.findMedian(), 0.0001);
 }

 @Test
 public void testFindMedianOddNumberOfElements() {
 FindMedianDataStream.MedianFinder mf = new FindMedianDataStream.MedianFinder();
 mf.addNum(3);
 mf.addNum(1);
 mf.addNum(7);
 assertEquals(3.0, mf.findMedian(), 0.0001);
 }

 @Test
 public void testFindMedianEvenNumberOfElements() {
 FindMedianDataStream.MedianFinder mf = new FindMedianDataStream.MedianFinder();
 mf.addNum(3);
 mf.addNum(1);
 mf.addNum(7);
 mf.addNum(5);
 assertEquals(4.0, mf.findMedian(), 0.0001);
 }
 }

