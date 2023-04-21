package personnes;
import java.util.Date;

public class Client extends IntervenantMagasin {
    private int numCarte;
    private String email;
    private String adresse;
    private int points;

    public Client(String nom, String prenom, Date dateNaissance, int numIntervenant, int numCarte, String email, String adresse, int points) {
        super(nom, prenom, dateNaissance, numIntervenant);
        this.numCarte = numCarte;
        this.email = email;
        this.adresse = adresse;
        this.points = points;
    }

    public int getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Client : " + super.toString() + ", Numéro de carte : " + numCarte + ", Email : " + email + ", Adresse : " + adresse + ", Points : " + points;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Client) {
            Client other = (Client) obj;
            return super.equals(obj) && numCarte == other.getNumCarte() && email.equals(other.getEmail()) && adresse.equals(other.getAdresse()) && points == other.getPoints();
        }
        return false;
    }
}
