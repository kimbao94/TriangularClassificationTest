import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class TriangularClassificationTest {

    @Test
    @DisplayName(" case 2/2/2")
    public void testClassifyTriangle2_2_2() {
        int[] size = {2,2,2};
        String expected = "Tam giác đều";
        String result = TriangularClassification.Triangular(size);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" case 2/2/3")
    public void testClassifyTriangle2_2_3() {
        int[] size = {2,2,3};
        String expected = "Tam giác cân";
        String result = TriangularClassification.Triangular(size);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" case 3/4/5")
    public void testClassifyTriangle3_4_5() {
        int[] size = {3,4,5};
        String expected = "Tam giác thường";
        String result = TriangularClassification.Triangular(size);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" case 8/2/3")
    public void testClassifyTriangle8_2_3() {
        int[] size = {8,2,3};
        String expected = "Không phải là tam giác";
        String result = TriangularClassification.Triangular(size);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" case -1/2/1")
    public void testClassifyTriangleNegative1_2_1() {
        int[] size = {-1,2,1};
        String expected = "Không phải là tam giác";
        String result = TriangularClassification.Triangular(size);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName(" case 0/1/1")
    public void testClassifyTriangle0_1_1() {
        int[] size = {0,1,1};
        String expected = "Không phải là tam giác";
        String result = TriangularClassification.Triangular(size);
        assertEquals(expected, result);
    }

}