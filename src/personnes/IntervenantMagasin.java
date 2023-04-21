package personnes;
import java.util.Date;
public abstract class IntervenantMagasin extends Personne {
    private int numIntervenant;

    public IntervenantMagasin(String nom, String prenom, Date dateNaissance, int numIntervenant) {
        super(nom, prenom, dateNaissance);
        this.numIntervenant = numIntervenant;
    }

    public int getNumIntervenant() {
        return numIntervenant;
    }

    public void setNumIntervenant(int numIntervenant) {
        this.numIntervenant = numIntervenant;
    }

    @Override
    public String toString() {
        return super.toString() + ", numéro intervenant : " + numIntervenant;
    }
}
