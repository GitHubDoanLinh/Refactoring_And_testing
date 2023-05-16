package triangle;

import org.junit.Test;

import static org.junit.Assert.*;
import static triangle.TriangleClassifier.*;

public class TriangleClassifierTest {


    @Test
    public void classify222() {
        String result = TriangleClassifier.classify(2,2,2);
        assertEquals(TriangleClassifier.TAM_GIAC_DEU, result);
    }
    @Test
    public void classify223() {
        String result = TriangleClassifier.classify(2,2,3);
        assertEquals(TAMGIACCAN, result);
    }
    @Test
    public void classify232() {
        String result = TriangleClassifier.classify(2,3,2);
        assertEquals(TAMGIACCAN, result);
    }
    @Test
    public void classify233() {
        String result = TriangleClassifier.classify(2,3,3);
        assertEquals(TAMGIACCAN, result);
    }
    @Test
    public void classify345() {
        String result = TriangleClassifier.classify(3,4,5);
        assertEquals(TAMGIACTHUONG, result);
    }
    @Test
    public void classify823() {
        String result = TriangleClassifier.classify(8,2,3);
        assertEquals(NOTATRIANGLE, result);
    }
    @Test
    public void classifyminus12minus1(){
        String result = TriangleClassifier.classify(-1,2,-1);
        assertEquals(NOTATRIANGLE, result);
    }
    @Test
    public void classify011(){
        String result = TriangleClassifier.classify(0,1,1);
        assertEquals(NOTATRIANGLE, result);
    }


}