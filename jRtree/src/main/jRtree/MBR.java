// MBR implementation. Assumes 2D rectangles

public class MBR {

    private Coord2D pt1;
    private Coord2D pt2;
    private Coord2D pt3;
    private Coord2D pt4;

    public MBR(double[][] mbr_square) {
        this.pt1 = new Coord2D(mbr_square[0]);
        this.pt2 = new Coord2D(mbr_square[1]);
        this.pt3 = new Coord2D(mbr_square[2]);
        this.pt4 = new Coord2D(mbr_square[3]);
    }

    public MBR(double[] pt1, double[] pt2, double[] pt3, double[] pt4) {
        this.pt1 = new Coord2D(pt1);
        this.pt2 = new Coord2D(pt2);
        this.pt3 = new Coord2D(pt3);
        this.pt4 = new Coord2D(pt4);
    }

    public MBR(Coord2D[] coord2DS){
        this.pt1 = coord2DS[0];
        this.pt2 = coord2DS[1];
        this.pt3 = coord2DS[2];
        this.pt4 = coord2DS[3];
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
            MBR castMBR = (MBR) aMBR;
            return this.pt1.equals(castMBR.getPt1()) &&
                    this.pt2.equals(castMBR.getPt2()) &&
                    this.pt3.equals(castMBR.getPt3()) &&
                    this.pt4.equals(castMBR.getPt4());
        }
        else {
            return false;
        }
    }
}
