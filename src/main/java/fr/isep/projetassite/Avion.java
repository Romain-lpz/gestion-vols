package fr.isep.projetassite;

public class Avion {
  private String immatriculation;
  private String modele;
  private int capacite;
  private Vol volAffecte;

  public Avion(String immatriculation, String modele, int capacite) {
    this.immatriculation = immatriculation;
    this.modele = modele;
    this.capacite = capacite;
    this.volAffecte = null;
  }

  public boolean verifierDisponibilite() {
    return this.volAffecte == null;
  }

  public void affecterVol(Vol vol) {
    if (verifierDisponibilite()) {
      this.volAffecte = vol;
      System.out.println("L'avion " + this.immatriculation + " a est affecté à " + vol.getNumeroVol());
    } else {
      System.out.println("L'avion " + this.immatriculation + " est déjà affecté à un autre vol.");
    }
  }

  public String getImmatriculation() {
    return this.immatriculation;
  }

  public String getModele() {
    return this.modele;
  }

  public int getCapacite() {
    return this.capacite;
  }
}
