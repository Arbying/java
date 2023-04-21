package autres;

public class Magasin {
    private static Magasin instance = null;
    private String nom;
    private String adresse;

    private Magasin(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public static Magasin getInstance(String nom, String adresse) {
        if (instance == null) {
            instance = new Magasin(nom, adresse);
        }
        return instance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Magasin : " + nom + " (" + adresse + ")";
    }
}
