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

    public double calculateEnlargement(NodeEntry ne){

        //Coordenandas del MBR de este NodeEntry

        MBR ne_mbr = ne.getMBR();


        /*
        Caso en que el MBR no crezca nada: esta entrada cabe completamente
        en el.
         */
        if(mbr.min_y()>=ne_mbr.min_y() && mbr.max_y()<= ne_mbr.max_y() &&
                mbr.min_x()>=ne_mbr.min_x() && mbr.max_x()<=ne_mbr.max_x()) {
            System.err.println("within MBR");
            return 0.0;
        }
        /*Caso en el que este MBR posea alguna coordenada mayor o menor a las
        * que definen el rango del MBR contenedor */
        else{

            return -1;
        }

    }
}
