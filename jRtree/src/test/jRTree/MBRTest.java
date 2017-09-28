import org.junit.Test;
import structure.Coord2D;
import structure.MBR;

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
        MBR mbr_1 = new MBR(mbr_square);  // structure.MBR using and array of points
        MBR mbr_2 = new MBR(pt1, pt2, pt3, pt4);  // structure.MBR(pt1, pt2, pt3, pt4) counterclockwise
        // assert
        assertEquals(mbr_1, mbr_2);
    }

    /**
     * Checks whether two MBRs intersect.
     */
    @Test
    public void MBRIntersection(){
        // arrange
        Coord2D leftBottom1 = new Coord2D(0,0);
        Coord2D topRight1 = new Coord2D(1,1);
        Coord2D leftBottom2 = new Coord2D(0.5,0.5);
        Coord2D topRight2 = new Coord2D(2,2);
        MBR mbr1 = new MBR(leftBottom1, topRight1);
        MBR mbr2 = new MBR(leftBottom2, topRight2);
        MBR mbr3 = new MBR(leftBottom1, leftBottom2);
        MBR mbr4 = new MBR(topRight1, topRight2);
        // act
        boolean intersect1 = mbr1.intersect(mbr2);
        boolean intersect2 = mbr2.intersect(mbr1);
        boolean intersect3 = mbr3.intersect(mbr4);
        // assert
        assertTrue(intersect1);
        assertTrue(intersect2);
        assertFalse(intersect3);
    }

}
