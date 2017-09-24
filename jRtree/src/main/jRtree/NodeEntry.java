public class NodeEntry{

    private MBR mbr;
    private Node child;

    public NodeEntry(){
        this(null,null);
    }

    public NodeEntry(MBR mbr, Node n){
        this.mbr = mbr;
        this.child = n;
    }

}
