package personnes;

import java.util.Date;

public class Caissier extends Employe {
    private int motDePasse;
    private float totalVentes;

    public Caissier(String nom, String prenom, Date dateNaissance, int numIntervenant, Date dateEntreeEnService, float salaireHoraire, int motDePasse, float totalVentes) {
        super(nom, prenom, dateNaissance, numIntervenant, dateEntreeEnService, salaireHoraire);
        this.motDePasse = motDePasse;
        this.totalVentes = totalVentes;
    }

    public int getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(int motDePasse) {
        this.motDePasse = motDePasse;
    }

    public float getTotalVentes() {
        return totalVentes;
    }

    public void setTotalVentes(float totalVentes) {
        this.totalVentes = totalVentes;
    }

    @Override
    public String toString() {
        return super.toString() + ", mot de passe : " + motDePasse + ", total des ventes : " + totalVentes;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Caissier other = (Caissier) obj;
        if (motDePasse != other.motDePasse)
            return false;
        if (Float.floatToIntBits(totalVentes) != Float.floatToIntBits(other.totalVentes))
            return false;
        return true;
    }
}
