
package tp2_relation_1_eljeljal;

public class Voiture { 
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire;

    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissanceCV() {
        return puissanceCV;
    }

    public void setPuissanceCV(int puissanceCV) {
        this.puissanceCV = puissanceCV;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Marque: " + marque + ", Modèle: " + modele + ", Puissance en CV: " + puissanceCV + ", propriétaire: " + (proprietaire != null ? proprietaire.toString() : "Aucun propriétaire");
    }
}



 
    