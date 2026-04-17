public class Aeroport {
    
    private String nom;
    private String ville;
    private String codeIATA;

    
    public Aeroport(String nom, String ville, String codeIATA) {
        this.nom = nom;
        this.ville = ville;
        this.codeIATA = codeIATA;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public String getCodeIATA() { return codeIATA; }
    public void setCodeIATA(String codeIATA) { this.codeIATA = codeIATA; }

    @Override
    public String toString() {
        return "Aeroport{" +
                "nom='" + nom + '\'' +
                ", ville='" + ville + '\'' +
                ", codeIATA='" + codeIATA + '\'' +
                '}';
    }
}
