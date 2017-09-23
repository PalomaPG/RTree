import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MBRTest {

    @Test
    public void MBRCreation(){
        // arrange
        double[][] mbr_square = {{1,1},{-1,1},{-1,-1},{-1,1}};  // Simple 2x2 rectangle
        double [] pt1 = {1,1};
        double [] pt2 = {-1,1};
        double [] pt3 = {-1,-1};
        double [] pt4 = {-1,1};
        // act
        MBR mbr_1 = new MBR(mbr_square);  // MBR using and array of points
        MBR mbr_2 = new MBR(pt1, pt2, pt3, pt4);  // MBR(pt1, pt2, pt3, pt4) counterclockwise
        // assert
        assertEquals(mbr_1, mbr_2);
    }

}
