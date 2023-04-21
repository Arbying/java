package personnes;

import java.util.Date;

public class Manager extends IntervenantMagasin {
    private float bonus;

    public Manager(String nom, String prenom, Date dateNaissance, int numIntervenant, float bonus) {
        super(nom, prenom, dateNaissance, numIntervenant);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus : " + bonus;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manager other = (Manager) obj;
        if (Float.floatToIntBits(bonus) != Float.floatToIntBits(other.bonus))
            return false;
        return true;
    }
}
