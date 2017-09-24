import java.util.ArrayList;

/**
 * Node class for RTree. A node can contain a maximum number of node entries M (Capacity).
 * M must be determined by the user (or automatically) to make a Node fits in a memory page.
 */

public class Node  implements INode{

    private ArrayList<NodeEntry> data;

    private boolean isLeaf;

    private int capacity;
    private int curSize;


    public Node(int capacity){
        this.capacity = capacity;
        this.curSize = 0;
        this.data = new ArrayList<NodeEntry>(capacity);
    }


    public int getCapacity() {
        return this.capacity;
    }

    public int getCurSize() {
        return this.curSize;
    }

    public boolean insert(NodeEntry ne){
        if (curSize < capacity){
            data.add(ne);
            curSize++;
            return true;
        }
        return false;
    }

    public MBR search(MBR mbr){
        return null;
    }
}
