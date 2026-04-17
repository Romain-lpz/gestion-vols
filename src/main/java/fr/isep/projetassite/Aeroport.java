package fr.isep.projetassite;

public class Aeroport {
    private String nom;
    private String ville;
    private String codeIATA;

    public Aeroport(String nom, String ville, String codeIATA) {
        this.nom = nom;
        this.ville = ville;
        this.codeIATA = codeIATA;
    }

    public String obtenirInfos() {
        return "Aéroport: " + nom + " (" + codeIATA + ") - Ville: " + ville;
    }

    public String getCodeIATA() { return codeIATA; }
    public String getNom() { return nom; }
    public String getVille() { return ville; }
}
