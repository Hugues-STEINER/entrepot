package ent.entrepot.monde;

public class Point {
    private int abscisse;
    private int ordonnee;

    public Point() {
    }

    public Point(int a, int o) {
        abscisse = a;
        ordonnee = o;
    }

    public Point(Point p) {
        abscisse = p.getAbscisse();
        ordonnee = p.getOrdonnee();
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }
}
