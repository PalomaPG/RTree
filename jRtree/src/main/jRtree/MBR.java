// MBR implementation. Assumes 2D rectangles, doesn't make any check.

public class MBR {

    private Coord2D pt1;
    private Coord2D pt2;
    private Coord2D pt3;
    private Coord2D pt4;

    public MBR(double[][] mbr_square) {
        this(new Coord2D(mbr_square[0]), new Coord2D(mbr_square[1]), new Coord2D(mbr_square[2]),
                new Coord2D(mbr_square[3]));
    }

    public MBR(double[] pt1, double[] pt2, double[] pt3, double[] pt4) {
        this(new Coord2D(pt1), new Coord2D(pt2), new Coord2D(pt3), new Coord2D(pt4));
    }

    public MBR(Coord2D[] coord2DS){
        this(coord2DS[0], coord2DS[1], coord2DS[2], coord2DS[3]);
    }

    public MBR(Coord2D pt1, Coord2D pt2, Coord2D pt3, Coord2D pt4){
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.pt3 = pt3;
        this.pt4 = pt4;
    }

    public Coord2D getPt1() {
        return pt1;
    }

    public Coord2D getPt2() {
        return pt2;
    }

    public Coord2D getPt3() {
        return pt3;
    }

    public Coord2D getPt4() {
        return pt4;
    }

    @Override
    public boolean equals(Object aMBR){
        if (aMBR instanceof MBR){
            MBR m = (MBR) aMBR;
            return this.pt1.equals(m.getPt1()) &&
                    this.pt2.equals(m.getPt2()) &&
                    this.pt3.equals(m.getPt3()) &&
                    this.pt4.equals(m.getPt4());
        }
        else {
            return false;
        }
    }
}
