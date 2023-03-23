package ent.entrepot.monde;

import ent.entrepot.outils.FabriqueID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Zone {
    private String nom;

    private String proprietaire;
    private String id;
    private ArrayList<Point> sommets;
    private int nbSommets;

    public Zone(){

    }
    public Zone(String nom, String proprietaire) {
        this.nom = nom;
        this.proprietaire = proprietaire;
        this.id = FabriqueID.getInstance().getIdZone();
        sommets = new ArrayList<>();
        nbSommets = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Point> getSommets() {
        return sommets;
    }

    public void addSommets(Point p) {
        sommets.add(p);
        nbSommets++;
    }

    public int getNbSommets() {
        return nbSommets;
    }

    public void setNbSommets(int nbSommets) {
        this.nbSommets = nbSommets;
    }

    public Iterator<Point> iterator() { return sommets.iterator(); }
}

