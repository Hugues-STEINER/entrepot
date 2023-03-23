package ent.entrepot.monde;

public class Zone {
    private String nom;
    private int id;
    private Point[] sommets;
    private int nbSommets;

    public Zone(){

    }
    public Zone(String nom, Point[] sommets, int nbSommets) {
        this.nom = nom;
        this.id = id;
        this.sommets = sommets;
        this.nbSommets = nbSommets;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
