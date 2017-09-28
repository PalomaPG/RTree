package structure;

public class NodeEntry{

    private MBR mbr;
    private INode child;

    public NodeEntry(){
        this(null,null);
    }

    public NodeEntry(MBR mbr, INode n){
        this.mbr = mbr;
        this.child = n;
    }

    public MBR getMBR() {
        return mbr;
    }

    public INode getChild(){
        return child;
    }
}
