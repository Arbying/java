package personnes;

import java.util.Date;

public class Employe extends IntervenantMagasin {
    private Date dateEntreeEnService;
    private float salaireHoraire;

    public Employe(String nom, String prenom, Date dateNaissance, int numIntervenant, Date dateEntreeEnService, float salaireHoraire) {
        super(nom, prenom, dateNaissance, numIntervenant);
        this.dateEntreeEnService = dateEntreeEnService;
        this.salaireHoraire = salaireHoraire;
    }

    public Date getDateEntreeEnService() {
        return dateEntreeEnService;
    }

    public void setDateEntreeEnService(Date dateEntreeEnService) {
        this.dateEntreeEnService = dateEntreeEnService;
    }

    public float getSalaireHoraire() {
        return salaireHoraire;
    }

    public void setSalaireHoraire(float salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }

    @Override
    public String toString() {
        return super.toString() + ", date d'entrée en service : " + dateEntreeEnService + ", salaire horaire : " + salaireHoraire;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employe other = (Employe) obj;
        if (dateEntreeEnService == null) {
            if (other.dateEntreeEnService != null)
                return false;
        } else if (!dateEntreeEnService.equals(other.dateEntreeEnService))
            return false;
        if (Float.floatToIntBits(salaireHoraire) != Float.floatToIntBits(other.salaireHoraire))
            return false;
        return true;
    }
}
