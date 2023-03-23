package ent.entrepot.outils;

public class FabriqueID {
    private int noZone;
    private static FabriqueID instance = new FabriqueID();

    private FabriqueID(){
        noZone = 0;
    }

    public String getIdZone(){
        noZone ++;
        return Integer.toString(noZone -1 );
    }
}
